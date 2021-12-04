package com.jack.smartcar;



/**
 * @author jacob
 
 *
 */
public  class Sensors {
	

	private String  AutoPilot;
	
	private  String collisionnDetection;
	private String laneDeparture;
	private String   pedestrianDetection ;
	private String   selfParkingMode;
	


	
	
	


	public String SelfDriving() {
		return getAutoPilot();
    }

	public String LaneDepartureAlarm() {
		return laneDeparture;
	}


	

	public String CollisionnDetectionAlarm() {
		return CollisionnDetectionAlarm();
	}

	public String PedestrianDetectionAlarm() {
		return PedestrianDetectionAlarm();
	}

	



	public String SelfParkingMode() {
		return selfParkingMode;
	}

	public String getCollisionnDetection() {
		return collisionnDetection ;
	}


	

	public String getPedestrianDetection() {
		return pedestrianDetection;
	}

	

	

	public String getAutoPilot() {
		return AutoPilot;
	 } 


}	
	
    

 

