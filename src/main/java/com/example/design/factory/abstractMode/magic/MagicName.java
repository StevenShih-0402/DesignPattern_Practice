package com.example.design.factory.abstractMode.magic;

import com.example.design.factory.abstractMode.CardName;

public class MagicName implements CardName {
    String name;

    public MagicName(){
        this.name = "";
    }

    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public void showName(){
        System.out.println("法術名稱：" + name);
    }
}