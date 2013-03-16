package testing;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import ostCom.OSTConnection;
import rest.JSONParsing;
import utils.Constants;
import classes.StopTime;
import classes.StopTimeList;
import enumerations.JSONClasses;

public class GetSchedules {

	/*
	 * Testar se os horarios devolvidos pertencem à trip associada 
	 * atribuida */
	@Test
	public void testAllSchedules() {
	
		int idRoute = 525;
		
		String myDate = "07:45";
		int rangeDate = 1;
			
		String schedulesRoutes = OSTConnection.getTimeSchedules(0, 25, idRoute, Constants.SMTUC, myDate, rangeDate);
		StopTimeList stopTimes = (StopTimeList)JSONParsing.parsed(schedulesRoutes, JSONClasses.StopTime);
		
		DateFormat dateFormat = new SimpleDateFormat("hh:mm");
		DateFormat rangeFormat = new SimpleDateFormat("hh");
		
		for (StopTime stoptime:stopTimes.getObjects()) {
		
			Date dateArrival = dateFormat.parse(stoptime.getArrival_times());
			Date dateDeparture = dateFormat.parse(stoptime.getDeparture_times());
			
			Date rangeParam = rangeFormat.parse(rangeDate+"");
			
			long arrivalTime = dateArrival.getTime();
			long departureTime = dateDeparture.getTime();
			
			long floorDate = arrivalTime - rangeParam.getTime();
			long ceilDate = arrivalTime + rangeParam.getTime();
			
			assertTrue( floorDate <= arrivalTime && arrivalTime <= ceilDate );
			assertTrue( floorDate <= departureTime && departureTime <= ceilDate );
		}
	}
}
