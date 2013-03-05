package main;

import ostCom.OSTConnection;
import rest.JSONParsing;
import utils.Constants;
import classes.RouteList;
import classes.StopList;
import enumerations.JSONClasses;

public class Main {

	public static void main(String[] args) {
		getStop();
		getRoute();
	}
	
	/*
	 * Imprime as primeiras 5 rotas encontradas*/
	private static void getRoute() {
		int numberRoutes = 5;
		
		String routesStr = OSTConnection.getRoutes(0, numberRoutes, Constants.SMTUC);
		RouteList routes = (RouteList)JSONParsing.parsed(routesStr, JSONClasses.Routes); 
				
		if (routes == null || routes.getObjects()==null || routes.getObjects().size()==0)
			System.out.println("Não foi possível encontrar rotas");
		else 
			System.out.println(routes.getObjects().get(0));
	}

	/*
	 * Vai imprimir a paragem mais próxima */
	public static void getStop() {
		int stopNumber = 25;
		
		String stopsStr = OSTConnection.getStops(0, stopNumber, Constants.SMTUC);
		StopList stops = (StopList)JSONParsing.parsed(stopsStr, JSONClasses.Stop); 		
	
		if (stops == null || stops.getObjects()==null || stops.getObjects().size()==0)
			System.out.println("Não foi possível encontrar uma paragem próxima");
		else 
			System.out.println(stops.getObjects().get(0));
	}
}
