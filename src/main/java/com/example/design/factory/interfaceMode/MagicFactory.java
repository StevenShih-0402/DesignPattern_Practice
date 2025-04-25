package com.example.design.factory.interfaceMode;

import com.example.design.factory.BaseCard;
import com.example.design.factory.MagicCard;
import com.example.design.factory.MinionCard;

public class MagicFactory implements InterfaceFactory{

    @Override
    public BaseCard printCard(){
        System.out.println("建立一張法術。");
        return new MagicCard();
    }
}
