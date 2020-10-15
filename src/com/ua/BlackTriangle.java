package com.ua;

public class BlackTriangle extends Triangle {
    private Color triangleColor;

    public BlackTriangle(double sideOne, double sideTwo, double sideThree, Color triangleColor) {
        super(sideOne, sideTwo, sideThree);
        this.triangleColor = triangleColor;
    }

    @Override
    public Color getColor() {
        return triangleColor;
    }

    @Override
    public String toString() {
        return "BlackTriangle: " +
                "triangleColor = " + triangleColor;
    }
}
