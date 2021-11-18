package com.company;

public class Calculator {
    private double x;
    private  double y;

    public Calculator(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getSum(){
        return x+y;
    }
    public double getSubtraction(){
        return Math.abs(x-y);
    }
    public double getMultiplication(){
        return x*y;

    }
    public double getDivision(){
        return x/y;
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
