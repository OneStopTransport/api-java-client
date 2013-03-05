package ostCom;

import rest.RestClient;
import utils.Constants;

public class OSTConnection {
	
	/*
	 * Obtem as paragens da plataforma 
	 * 	offset - obtem a partir do offset
	 * 	results - n de resultados obtidos */
	public static String getStops(int offset, int results, int agency) {
		String response = "";
		try {
			response = RestClient.executeHttpGet(Constants.API + "/stops/?key=" + Constants.APIKEY + "&agency=" + agency + "&withroutes=true"+ "&center=" + Constants.myLocation[0]+","+Constants.myLocation[1] + "&range=100" + "&offset=" + offset + "&results=" + results);				
		} catch (Exception e) {
			System.out.println("Não há net");
		}
		return response;
	}
	
	/*
	 * Obtem as rotas 
	 * 	offset - obtem a partir do offset
	 * 	results - n de resultados obtidos */
	public static String getRoutes(int offset, int results, int agency) {
		String response = "";
		/*try {*/
			
			response = RestClient.executeHttpGet(Constants.API + "/routes/?key=" + Constants.APIKEY + "&agency=" + agency + "&offset=" + offset + "&results="+results );

		/*} catch (Exception e) {
			System.out.println("Não há net");
		}*/
		return response;
	}
	
	/*
	 * Dada a rota e a trip, obtem os vários horários  */	
	public static String getSchedules(int offset, int results, int routesId, int agency) {
		String response = "";
		try {
			response = RestClient.executeHttpGet(Constants.API + "/stoptimes/?route=" + routesId + "&key=" + Constants.APIKEY + "&agency=" + agency + "&offset=" + offset );				
		} catch (Exception e) {
			System.out.println("Não há net");
		}
		return response;
	}
	
	/*
	 * Dada a rota e a trip, obtem os vários horários  */	
	public static String getTimeSchedules(int offset, int results, int routesId, int agency, String time, int range) {
		String response = "";
		try {
			response = RestClient.executeHttpGet(Constants.API + "/stoptimes/?route=" + routesId + "&key=" + Constants.APIKEY + "&agency=" + agency + "&offset=" + offset + "&range=" + range + "&time=" + time );				
		} catch (Exception e) {
			System.out.println("Não há net");
		}
		return response;
	}
	
	/*
	 * Dada a rota obtem as várias trips
	 * Se rota == -1, obtem todas as trips  */	
	public static String getTrips(int offset, int results, long routesId) {
		String response = "";
		try {
			response = RestClient.executeHttpGet(Constants.API + "/trips/?key=" + Constants.APIKEY + "&offset=" + offset + (routesId==-1? "":("&route=" + routesId)) );				
		} catch (Exception e) {
			System.out.println("Não há net");
		}
		return response;
	}
	
	/* 
	 * Usado para obter uma resposta para um determinado url */
	public static String getCustomUrl(String url) {
		String response = "";
		try {
			response = RestClient.executeHttpGet(Constants.API + url);				
		} catch (Exception e) {
			System.out.println("Não há net");
		}
		return response;
	}
	
}
