package com.example.design.decorator;

public class BubbleDecorator extends BaseDrinkDecorator {
    public BubbleDecorator(BaseDrink drink) {
        // 呼叫父類別建構式
        super(drink);
    }

    @Override
    public int cost() {
        return drink.cost() + 5; // 珍珠加價5元
    }
} 