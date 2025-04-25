package com.example.design.decorator;

import lombok.Data;

@Data
public abstract class BaseDrink {
    String flavor;

    public abstract int cost();
}
