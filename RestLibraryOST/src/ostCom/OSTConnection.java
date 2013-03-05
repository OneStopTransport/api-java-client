package ostCom;

import rest.RestClient;
import utils.Constants;

public class OSTConnection {
	
	/* 	offset - obtem a partir do offset
	 * 	results - n de resultados obtidos */

	/*
	 * Obtem as paragens da plataforma */
	public static String getStops(int offset, int results, int agency) {
		String response = RestClient.executeHttpGet(Constants.API + "/stops/?key=" + Constants.APIKEY + "&agency=" + agency + "&withroutes=true"+ "&center=" + Constants.myLocation[0]+","+Constants.myLocation[1] + "&range=100" + "&offset=" + offset + "&results=" + results);				
		return response;
	}
	
	/*
	 * Obtem as rotas 
	 * 	offset - obtem a partir do offset
	 * 	results - n de resultados obtidos */
	public static String getRoutes(int offset, int results, int agency) {
		String response = RestClient.executeHttpGet(Constants.API + "/routes/?key=" + Constants.APIKEY + "&agency=" + agency + "&offset=" + offset + "&results="+results );
		return response;
	}
	
	/*
	 * Dada a rota, obtem os vários horários  */	
	public static String getSchedules(int offset, int results, int routesId, int agency) {
		String response = RestClient.executeHttpGet(Constants.API + "/stoptimes/?route=" + routesId + "&key=" + Constants.APIKEY + "&agency=" + agency + "&offset=" + offset );				
		return response;
	}
	
	/*
	 * Dada a rota, o time e o range, obtem os vários horários  */	
	public static String getTimeSchedules(int offset, int results, int routesId, int agency, String time, int range) {
		String response = RestClient.executeHttpGet(Constants.API + "/stoptimes/?route=" + routesId + "&key=" + Constants.APIKEY + "&agency=" + agency + "&offset=" + offset + "&range=" + range + "&time=" + time );				
		return response;
	}
	
	/*
	 * Dada a rota obtem as várias trips
	 * Se rota == -1, obtem todas as trips  */	
	public static String getTrips(int offset, int results, long routesId) {
		String response = RestClient.executeHttpGet(Constants.API + "/trips/?key=" + Constants.APIKEY + "&offset=" + offset + (routesId==-1? "":("&route=" + routesId)) );				
		return response;
	}
	
	/* 
	 * Usado para obter uma resposta para um determinado url */
	public static String getCustomUrl(String url) {
		String response = RestClient.executeHttpGet(Constants.API + url);				
		return response;
	}
	
}
