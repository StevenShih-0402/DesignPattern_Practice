package com.example.design.factory.abstractMode.magic;

import com.example.design.factory.abstractMode.CardAttribute;

public class MagicAttribute implements CardAttribute {
    private String attribute;

    public MagicAttribute() {
        this.attribute = ""; // 預設值
    }

    @Override
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    @Override
    public void showAttribute() {
        System.out.println("法術屬性：" + attribute);
    }
}
