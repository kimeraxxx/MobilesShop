package com.example.movilesjo.IntervalBattery;

import com.example.movilesjo.model.mobile.Battery;

public interface Handler {

	public void setNext(Handler handler);

	public int handle(Battery request);
}
