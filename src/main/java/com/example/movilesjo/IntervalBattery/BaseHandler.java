package com.example.movilesjo.IntervalBattery;

import com.example.movilesjo.model.mobile.Battery;

public abstract class BaseHandler implements Handler {
	Handler next;

	public BaseHandler() {
		super();
	}

	@Override
	public void setNext(Handler handler) {
		next = handler;
	}

	@Override
	public int handle(Battery request) {
		if (next != null) {
			return next.handle(request);
		}
		return 0;
	}
}
