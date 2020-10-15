package com.ua;

public class WhiteCircle extends Circle{
    private Color circleColor;

    public WhiteCircle(double radius, Color circleColor) {
        super(radius);
        this.circleColor = circleColor;
    }

    @Override
    public Color getColor() {
        return circleColor;
    }

    @Override
    public String toString() {
        return "WhiteCircle: " +
                "circleColor = " + circleColor;
    }
}
