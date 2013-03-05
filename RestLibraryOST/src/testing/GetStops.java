package testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import classes.StopList;

import enumerations.JSONClasses;

import ostCom.OSTConnection;
import rest.JSONParsing;
import utils.Constants;

public class GetStops {

	/*
	 * Testar as primeiras 25 stops */
	@Test
	public void testFirstStops() {
		int numberStops = 25;
		
		String stopsStr = OSTConnection.getStops(0, numberStops, Constants.SMTUC);
		StopList stops = (StopList)JSONParsing.parsed(stopsStr, JSONClasses.Stop); 
		
		//testar se consegue encontrar pelo menos as primeiras 25 paragens
		assertEquals(numberStops, stops.getObjects().size());
	}

	/*
	 * Testar se não encontra nenhuma paragem estando numa localização errada */
	@Test
	public void testBadLocationStops() {
		int numberStops = 25;
		Constants.myLocation = new float [] {(float)20, (float)10};
		String stopsStr = OSTConnection.getStops(0, numberStops, Constants.SMTUC);
		StopList stops = (StopList)JSONParsing.parsed(stopsStr, JSONClasses.Stop); 
		
		//testar se consegue encontrar pelo menos as primeiras 25 paragens
		assertEquals(stops.getObjects().size(), 0);
	}
	
	/*
	 * Testar se consegue ir buscar todas as paragens, ou seja
	 * até o campo next ser nulo */
	@Test
	public void testAllStops() {
		int count = 0, results = 25;
		
		String stopsStr = OSTConnection.getStops(count, results, Constants.SMTUC);
		StopList stops = (StopList)JSONParsing.parsed(stopsStr, JSONClasses.Stop); 
		
		ArrayList<String> stopsName = new ArrayList<String>();
				
		while (stops.getMeta().getNext()!=null) {
			for (int i=0; i<stops.getObjects().size(); i++) {
				stopsName.add(stops.getObjects().get(i).getName());	
			}
			stopsStr = OSTConnection.getCustomUrl(stops.getMeta().getNext());
			stops = (StopList)JSONParsing.parsed(stopsStr, JSONClasses.Stop); 
		}
		
		assertNull(stops.getMeta().getNext());
	}	
	
	/*
	 * Testa se não encontra nenhuma paragem caso passe uma 
	 * agência errada por parametro */
	@Test
	public void testZeroStops() {
		//nao existe nenhuma agencia com id = 0
		int agency = 0, numberStops=25;
		
		String stopsStr = OSTConnection.getStops(0, numberStops, agency);
		StopList stops = (StopList)JSONParsing.parsed(stopsStr, JSONClasses.Stop); 
		
		//testar se consegue encontrar pelo menos as primeiras 25 paragens
		assertEquals(stops.getObjects().size(), 0);
	}
}
