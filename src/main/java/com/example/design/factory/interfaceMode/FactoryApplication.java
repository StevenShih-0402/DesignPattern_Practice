package com.example.design.factory.interfaceMode;

import com.example.design.factory.BaseCard;

public class FactoryApplication {

    public static void main(String[] args) {

        // 工廠模式：用實體的工廠去新建各自類型的卡牌
        MinionFactory minionFactory = new MinionFactory();
        BaseCard minion = minionFactory.printCard();

        MagicFactory magicFactory = new MagicFactory();
        BaseCard magic = magicFactory.printCard();

        minion.showType();
        magic.showType();
    }
}
