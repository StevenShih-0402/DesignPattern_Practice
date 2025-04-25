package com.example.design.decorator;

public class GreenTea extends BaseDrink{

    GreenTea(){
        setFlavor("Green Tea");
    }

    @Override
    public int cost(){
        return 50;
    }
}
