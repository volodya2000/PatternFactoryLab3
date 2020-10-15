package com.ua;

public class BlackCircle extends Circle {
    private Color circleColor;

    public BlackCircle(double radius, Color circleColor) {
        super(radius);
        this.circleColor = circleColor;
    }

    @Override
    public Color getColor() {
        return circleColor;
    }

    @Override
    public String toString() {
        return "BlackCircle: " +
                "circleColor = " + circleColor;
    }
}
