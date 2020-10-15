package com.ua;

public abstract class Circle {
    private double radius;
    private final static double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static double getPI() {
        return PI;
    }

    public double calculateSquare(){
        return PI*Math.pow(radius,2);
    }
    public abstract Color getColor();
}
