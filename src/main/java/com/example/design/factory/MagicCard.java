package com.example.design.factory;

public class MagicCard implements BaseCard{
    @Override
    public void showType(){
        System.out.println("Magic Card");
    }
}