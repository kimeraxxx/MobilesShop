package com.example.movilesjo.IntervalBattery;

import com.example.movilesjo.model.mobile.Battery;

public class SecondInterval extends BaseHandler {
	
	private final int min = 1000;
	private final int max = 1999;

	
	@Override
	public int handle(Battery batery) {
		if (batery.getMAhNumber()>=min && batery.getMAhNumber()<=max) {
			return 10;
		}
		return super.handle(batery);
	}
	
}
