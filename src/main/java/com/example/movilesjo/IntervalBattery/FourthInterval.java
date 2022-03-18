package com.example.movilesjo.IntervalBattery;

import com.example.movilesjo.model.mobile.Battery;

public class FourthInterval extends BaseHandler{
	
	private final int min = 3000;
	private final int max = 3999;
	
	@Override
	public int handle(Battery batery) {
		if (batery.getMAhNumber()>=min && batery.getMAhNumber()<=max) {
			return 20;
		}
		return super.handle(batery);
	}

}
