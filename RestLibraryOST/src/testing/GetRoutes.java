package testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import ostCom.OSTConnection;
import rest.JSONParsing;
import utils.Constants;
import classes.RouteList;
import classes.TripList;
import enumerations.JSONClasses;

public class GetRoutes {

	/*
	 * Testar as primeiras 5 rotas */
	@Test
	public void testFirstRoutes() {
		int numberRoutes = 5;
		
		String routesStr = OSTConnection.getStops(0, numberRoutes, Constants.SMTUC);
		RouteList routes = (RouteList)JSONParsing.parsed(routesStr, JSONClasses.Routes); 
		
		//testar se consegue encontrar pelo menos as primeiras 5 rotas
		assertEquals(numberRoutes, routes.getObjects().size());
	}
	
	/*
	 * Das rotas devolvidas, verificar se as trips associadas contém o id da rota */
	@Test
	public void testRouteTrips() {
		int numberRoutes = 10;
		
		String routesStr = OSTConnection.getRoutes(0, numberRoutes, Constants.SMTUC);
		RouteList routes = (RouteList)JSONParsing.parsed(routesStr, JSONClasses.Routes); 
				
		for (int i=0; i<routes.getObjects().size(); i++) {
			String tripJson = OSTConnection.getTrips(0,numberRoutes,routes.getObjects().get(i).getId());
			TripList trips = (TripList)JSONParsing.parsed(tripJson, JSONClasses.Trips);
			for (int j=0; j<trips.getObjects().size(); j++)
				assertEquals(routes.getObjects().get(i).getId(), trips.getObjects().get(j).getRoute_id());		
		}
	}
	
	/*
	 * Testar se consegue ir buscar todas as rotas, ou seja
	 * até o campo next ser nulo */
	@Test
	public void testAllRoutes() {
		int count = 0, results = 25;
		
		String routesStr = OSTConnection.getRoutes(count, results, Constants.SMTUC);
		RouteList routes = (RouteList)JSONParsing.parsed(routesStr, JSONClasses.Routes); 
		
		ArrayList<String> routesName = new ArrayList<String>();
				
		while (routes.getMeta().getNext()!=null) {
			for (int i=0; i<routes.getObjects().size(); i++) {
				routesName.add(routes.getObjects().get(i).getShort_name());	
			}
			routesStr = OSTConnection.getCustomUrl(routes.getMeta().getNext());
			routes = (RouteList)JSONParsing.parsed(routesStr, JSONClasses.Routes); 
		}
		
		assertNull(routes.getMeta().getNext());
	}
}
