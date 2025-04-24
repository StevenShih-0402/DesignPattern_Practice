package com.example.decorator;

public class BlackTea extends BaseDrink{

    BlackTea(){
        setFlavor("Black Tea");
    }

    @Override
    public int cost(){
        return 40;
    }
}
