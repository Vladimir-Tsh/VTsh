package com.javarush.task.task14.task1409;

public class WaterBridge implements Bridge {
    private final int CARSCOUNT = 5;
    @Override
    public int getCarsCount() {
        return this.CARSCOUNT;
    }
}
