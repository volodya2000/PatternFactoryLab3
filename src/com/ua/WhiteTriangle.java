package com.ua;

public class WhiteTriangle extends Triangle {
    private Color triangleColor;

    public WhiteTriangle(double sideOne, double sideTwo, double sideThree, Color triangleColor) {
        super(sideOne, sideTwo, sideThree);
        this.triangleColor = triangleColor;
    }

    @Override
    public Color getColor() {
        return triangleColor;
    }

    @Override
    public String toString() {
        return "WhiteTriangle: " +
                "triangleColor = " + triangleColor;
    }
}
