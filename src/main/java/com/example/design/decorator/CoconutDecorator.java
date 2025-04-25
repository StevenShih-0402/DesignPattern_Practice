package com.example.design.decorator;

public class CoconutDecorator extends BaseDrinkDecorator {
    public CoconutDecorator(BaseDrink drink) {
        super(drink);
    }

    @Override
    public int cost() {
        return drink.cost() + 3; // 椰果加價3元
    }
} 