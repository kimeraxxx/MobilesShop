package com.example.movilesjo.model.mobile;

import com.example.movilesjo.utiles.Utiles;

public class PriceCalculator implements Calculator {

	private Ram ram;
	private Processor processor;
	private Screen screen;
	private Battery battery;
	private final int PRICE_MULTIPLIER = 2;

	public PriceCalculator(Ram ram, Processor processor, Screen screen, Battery batery) {
		super();
		this.ram = ram;
		this.processor = processor;
		this.screen = screen;
		this.battery = batery;
	}

	@Override
	public float calculate() {
		BatteryCalculator batteryCalculator = new BatteryCalculator(battery);
		float concretePercentage = batteryCalculator.calculate();
		float capacity = ram.getCapacity() + ram.getCapacity();
		float result = (Float.valueOf(this.processor.calculateResult()) + capacity)
				* Float.valueOf(this.screen.getScreenSize());
		result += (result * concretePercentage) / 100;
		result *= PRICE_MULTIPLIER;
		return Utiles.convertNumberTwoDecimals(result);
	}
}
