package com.example.movilesjo.IntervalBattery;

import com.example.movilesjo.model.mobile.Battery;

public class SeventhInterval extends BaseHandler {
	
	private final int min = 6000;
	private final int max = 6999;
	
	@Override
	public int handle(Battery batery) {
		if (batery.getMAhNumber()>=min && batery.getMAhNumber()<=max) {
			return 35;
		}
		return super.handle(batery);
	}

}
