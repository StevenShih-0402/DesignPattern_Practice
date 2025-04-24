package com.example.decorator;

public class IceCreamDecorator extends BaseDrinkDecorator{

    public IceCreamDecorator(BaseDrink drink){
        super(drink);
    }

    @Override
    public int cost(){
        return drink.cost() + 10;
    }

}
