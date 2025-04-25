package com.example.design.factory.abstractMode.magic;

import com.example.design.factory.abstractMode.CardEffect;

public class MagicEffect implements CardEffect {
    private String effect;

    public MagicEffect() {
        this.effect = ""; // 預設值
    }

    @Override
    public void setEffect(String effect) {
        this.effect = effect;
    }

    @Override
    public void showEffect() {
        System.out.println("法術效果：" + effect);
    }
}
