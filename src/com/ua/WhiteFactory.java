package com.ua;

public class WhiteFactory implements BaseFactory {
    @Override
    public Circle createCircle(double radius) {
        return new WhiteCircle(radius,Color.WHITE);
    }

    @Override
    public Triangle createTriangle(double sideOne,double sideTwo,double sideThree) {
        return new WhiteTriangle(sideOne,sideTwo,sideThree, Color.WHITE);
    }
}
