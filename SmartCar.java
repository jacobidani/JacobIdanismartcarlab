package com.jack.smartcar;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

    public  class SmartCar implements SelfCheckCapable { ;





	private static String make="Jack";
	private String url;
	public String model;
	public double year;
	public String color;
	public String VIN;
	private Sensors mainsensors;
	private Button pushButton;
	private Engine Accelerate;
	private Battery RechargeBattery;
	private Suspension forward;
	private Brakes stopCar; 
	private Interior DriverDashboard;
	private Direction<?> ReadTrafficSigns;
	
	    public  SmartCar () {
	    	url = "https://www.jacks.com";
	    	setPushButton(new startcar ());
	    	setForward(suspension());
	    	setAccelerate(Engine ());
	    	setMainsensors(Sensors ());
	    	setStopCar(Brakes());
	    	setReadTrafficsSigns(Direction());
	    }
	  
	  	public static void main(String[] args) {
		   
		   SmartCar mySmartCar= new SmartCar ();
		   mySmartCar.runSelfCheck();
	   }
	
	  private void setReadTrafficsSigns(Object direction) {
			// TODO Auto-generated method stub
			
		}


	private Object Direction() {
			// TODO Auto-generated method stub
			return null;
		}


	private Sensors Sensors() {
			// TODO Auto-generated method stub
			return null;
		}


	private Suspension suspension() {
			// TODO Auto-generated method stub
			return null;
		}


	private Engine Engine() {
			// TODO Auto-generated method stub
			return null;
		}


	private Brakes Brakes() {
			// TODO Auto-generated method stub
			return null;
	}


	public  int moveForward() {
			return 0;
	}	
		  public  int moveBackward() {
			return 0;
		  }	
		  
		  public int emergencyStop() {
			return 0;
		  }	

		  public double matchSpeedFrontCar() {
				return 0;
		
		  }


		public static String getMake() {
			return make;
		}


		public static void setMake(String make) {
			SmartCar.make = make;
		}


		public Sensors getMainsensors() {
			return mainsensors;
		}


		public void setMainsensors(Sensors mainsensors) {
			this.mainsensors = mainsensors;
		}


		public Button getPushButton() {
			return pushButton;
		}


		public void setPushButton(Button pushButton) {
			this.pushButton = pushButton;
		}


		public Engine getAccelerate() {
			return Accelerate;
		}


		public void setAccelerate(Engine accelerate) {
			Accelerate = accelerate;
		}


		public Battery getRechargeBattery() {
			return RechargeBattery;
		}


		public void setRechargeBattery(Battery rechargeBattery) {
			RechargeBattery = rechargeBattery;
		}


		public Suspension getForward() {
			return forward;
		}


		public void setForward(Suspension forward) {
			this.forward = forward;
		}


		public Brakes getStopCar() {
			return stopCar;
		}


		public void setStopCar(Brakes stopCar) {
			this.stopCar = stopCar;
		}


		public Interior getDriverDashboard() {
			return DriverDashboard;
		}


		public void setDriverDashboard(Interior driverDashboard) {
			DriverDashboard = driverDashboard;
		} 
	


		@Override
		public boolean selfCheck() {
			// TODO Auto-generated method stub
			return SelfCheckUtils.randomCheck(0.1);
		}
		
		@Override
		public String getComponentName() {
			// TODO Auto-generated method stub
			return "SmarCar";
		}

		@Override
		public boolean runSelfCheck() {
			// TODO Auto-generated method stub
			return SelfCheckUtils.basicSelfCheckRunner(this);
		}


		public Direction<?> getReadTrafficSigns() {
			return ReadTrafficSigns;
		}


		public void setReadTrafficSigns(Direction<?> readTrafficSigns) { 
			ReadTrafficSigns = readTrafficSigns;
		
		}

		@Override
		public String getComponentName1() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean selfCheck1() {
			// TODO Auto-generated method stub
			return false;
		}
		     
		         		
                      


}
