package com.example.movilesjo.IntervalBattery;

import com.example.movilesjo.model.mobile.Battery;

public class SixthInterval extends BaseHandler{

	private final int min = 5000;
	private final int max = 5999;
	
	@Override
	public int handle(Battery batery) {
		if (batery.getMAhNumber()>=min && batery.getMAhNumber()<=max) {
			return 30;
		}
		return super.handle(batery);
	}
	
}
