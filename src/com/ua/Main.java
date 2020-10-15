package com.ua;

public class Main {

    public static void main(String[] args) {
        BlackTriangle blacktriangle = (BlackTriangle) AbstractFactory.getFactory("BLACK").createTriangle(5,5,5);
        WhiteTriangle whitetriangle =  (WhiteTriangle) AbstractFactory.getFactory("WHITE").createTriangle(5,5,5);
        BlackCircle blackcircle = (BlackCircle) AbstractFactory.getFactory("BLACK").createCircle(5);
        WhiteCircle whitecircle = (WhiteCircle) AbstractFactory.getFactory("WHITE").createCircle(5);

        System.out.println(blacktriangle);
        System.out.println(whitetriangle);
        System.out.println(blackcircle);
        System.out.println(whitecircle);
    }
}
