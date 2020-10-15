package com.ua;

public class AbstractFactory {
    public static BaseFactory getFactory(String name){
        if (name.equalsIgnoreCase("BLACK")) {
            return new BlackFactory();
        }
        else if (name.equalsIgnoreCase("WHITE")){
            return new WhiteFactory();
        }
        else throw new RuntimeException("Invalid Factory Name");
    }
}
