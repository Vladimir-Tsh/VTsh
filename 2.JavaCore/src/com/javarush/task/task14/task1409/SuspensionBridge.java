package com.javarush.task.task14.task1409;

public class SuspensionBridge implements Bridge {
    private final int CARSCOUNT = 15;
    @Override
    public int getCarsCount() {
        return this.CARSCOUNT;
    }
}
