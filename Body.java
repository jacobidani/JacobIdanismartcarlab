package com.jack.smartcar;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;


	

	public class Body implements SelfCheckCapable {
		   public Body() {
			   new SmartCar();
		   }

		@Override
		public String getComponentName() {
			// TODO Auto-generated method stub
			return "four dourr";
		}

		@Override
		public boolean selfCheck() {
			// TODO Auto-generated method stub
			return SelfCheckUtils.randomCheck(0.5);
		}

		@Override
		public boolean runSelfCheck() {
			// TODO Auto-generated method stub
			return false;
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



	



	


