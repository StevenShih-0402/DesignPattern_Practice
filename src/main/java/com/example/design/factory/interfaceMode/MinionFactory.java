package com.example.design.factory.interfaceMode;

import com.example.design.factory.BaseCard;
import com.example.design.factory.MagicCard;
import com.example.design.factory.MinionCard;

// 專門建立手下的工廠
public class MinionFactory implements InterfaceFactory{

    @Override
    public BaseCard printCard(){
        System.out.println("建立一張手下。");
        return new MinionCard();
    }
}
