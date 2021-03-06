package com.example.movilesjo.IntervalBattery;

import com.example.movilesjo.model.mobile.Battery;

public class ThirdInterval extends BaseHandler {
	
	private final int min = 2000;
	private final int max = 2999;
	
	@Override
	public int handle(Battery batery) {
		if (batery.getMAhNumber()>=min && batery.getMAhNumber()<=max) {
			return 15;
		}
		return super.handle(batery);
	}

}
