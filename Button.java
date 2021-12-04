package com.jack.smartcar;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

public class Button implements SelfCheckCapable{
	
      

	public Button getPushButton() {
		return getPushButton();
	}


	@Override
	public String getComponentName() {
		return null;
	}

	@Override
	public boolean selfCheck1() {
		boolean start = false;
		return start;
	}



@Override
public boolean selfCheck() {
	return SelfCheckUtils.randomCheck(0.2);
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
}


