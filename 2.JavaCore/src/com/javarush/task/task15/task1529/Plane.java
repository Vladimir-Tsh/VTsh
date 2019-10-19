package com.javarush.task.task15.task1529;

public class Plane implements CanFly{
    private int countPas;
    public Plane(int countPas) {
        this.countPas = countPas;
    }

    public int getCountPas() {
        return countPas;
    }

    public void setCountPas(int countPas) {
        this.countPas = countPas;
    }

    @Override
    public void fly() {

    }
}
