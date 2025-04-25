package com.example.design.factory.abstractMode.magic;

import com.example.design.factory.abstractMode.CardCost;

public class MagicCost implements CardCost {
    private int cost;

    public MagicCost() {
        this.cost = 0; // 預設值
    }

    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public void showCost() {
        System.out.println("法術費用：" + cost + " 點法力值");
    }
}
