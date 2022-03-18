package com.example.movilesjo.IntervalBattery;

import com.example.movilesjo.model.mobile.Battery;

public class DefaultPorcentage extends BaseHandler {

	@Override
	public int handle(Battery request) {
		return 3;
	}
}