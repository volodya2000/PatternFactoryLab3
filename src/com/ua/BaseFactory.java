package com.ua;

public interface BaseFactory {
    Circle createCircle(double radius);
    Triangle createTriangle(double sideOne,double sideTwo,double sideThree);
}
