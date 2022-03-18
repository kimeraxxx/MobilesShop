package com.example.movilesjo.model.mobile;

import com.example.movilesjo.IntervalBattery.*;

import java.util.ArrayList;
import com.example.movilesjo.model.mobile.Calculator;

public class BatteryCalculator implements Calculator {
    ArrayList<Handler> intervalListBattery;
    private Battery battery;
    Handler initial;

    public BatteryCalculator(Battery batery) {
        this.battery = batery;
        intervalListBattery = new ArrayList<Handler>();
        fillArrayIntervals();
        addNext(intervalListBattery);
    }






    private void fillArrayIntervals() {
        intervalListBattery.add(new FirstInterval());
        intervalListBattery.add(new SecondInterval());
        intervalListBattery.add(new ThirdInterval());
        intervalListBattery.add(new FourthInterval());
        intervalListBattery.add(new FifthInterval());
        intervalListBattery.add(new SixthInterval());
        intervalListBattery.add(new SeventhInterval());
        intervalListBattery.add(new DefaultPorcentage());
    }

    private void addNext(ArrayList<Handler> intervalListBattery) {
        initial = intervalListBattery.get(0);
        for (int i = 0; i < intervalListBattery.size() - 1; i++) {
            intervalListBattery.get(i).setNext(intervalListBattery.get(i + 1));
        }
    }

    @Override
    public float calculate() {
        return initial.handle(this.battery);
    }
}
