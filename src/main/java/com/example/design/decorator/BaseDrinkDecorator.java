package com.example.design.decorator;

public abstract class BaseDrinkDecorator extends BaseDrink {
    protected BaseDrink drink;

    public BaseDrinkDecorator(BaseDrink drink) {
        this.drink = drink;
    }

    @Override
    public abstract int cost();
}
