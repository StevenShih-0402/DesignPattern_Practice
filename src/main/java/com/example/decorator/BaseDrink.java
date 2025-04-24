package com.example.decorator;

import lombok.Data;

@Data
public abstract class BaseDrink {
    String flavor;

    public abstract int cost();
}
