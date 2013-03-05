package main;

import ostCom.OSTConnection;
import rest.JSONParsing;
import utils.Constants;
import classes.Route;
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
				
		for (Route routeTemp: routes.getObjects()) {
			System.out.println(routeTemp);
		}
	}

	/*
	 * Vai imprimir a paragem mais próxima */
	public static void getStop() {
		int stopNumber = 25;
		
		String stopsStr = OSTConnection.getStops(0, stopNumber, Constants.SMTUC);
		StopList stops = (StopList)JSONParsing.parsed(stopsStr, JSONClasses.Stop); 		
	
		//imprime a paragem mais próxima
		try {
			System.out.println(stops.getObjects().get(0));
		} catch (Exception e) {
			System.out.println("Não foi possível encontrar uma paragem próxima");
		}
	}
}
