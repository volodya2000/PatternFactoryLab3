package com.ua;

public class BlackFactory implements BaseFactory {
    @Override
    public Circle createCircle(double radius) {
        return new BlackCircle(radius,Color.BLACK);
    }

    @Override
    public Triangle createTriangle(double sideOne,double sideTwo,double sideThree) {
        return new BlackTriangle(sideOne,sideTwo,sideThree, Color.BLACK);
    }
}
