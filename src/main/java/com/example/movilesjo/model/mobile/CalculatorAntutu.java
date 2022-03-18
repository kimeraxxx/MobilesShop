package com.example.movilesjo.model.mobile;
import com.example.movilesjo.model.mobile.Calculator;

public class CalculatorAntutu {
    private final int ANTUTU_MULTIPLIER = 12000;
    private float ramCapacity;
    private float processorRate;

    public CalculatorAntutu(Processor processor, Ram ram) {
        this.ramCapacity = ram.getCapacity();
        this.processorRate = processor.calculateResult();
    }


    public float calculate() {
        float capacity = this.ramCapacity + this.ramCapacity;
        return (this.processorRate + capacity) * ANTUTU_MULTIPLIER;
    }
}
