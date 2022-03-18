package com.example.movilesjo.model.mobile;

import com.example.movilesjo.utiles.*;

public class SlopeCalculator implements Calculator {
	private Slope slope;
	private float valoration;
	private float coordinateX;

	public SlopeCalculator(Mobile mobile) {
		this.valoration = mobile.getValoration();
		this.coordinateX = mobile.getPrizeWithoutCurrencyType();
		this.slope = new Slope(coordinateX);
	}

	public float getCoordinateX() {
		return coordinateX;
	}

	public float getValoration() {
		return valoration;
	}

	public Slope getSlope() {
		return slope;
	}

	@Override
	public float calculate() {
		if (this.valoration < 5.0f) {
			slope.setSlope(-20);
			slope.nextDay();
			coordinateX = slope.getCoordinateX();
		}

		if (this.valoration == 10.0f) {
			slope.setSlope(20);
			slope.nextDay();
			coordinateX = slope.getCoordinateX();
		}
		return Utiles.convertNumberTwoDecimals(coordinateX);
	}
}
