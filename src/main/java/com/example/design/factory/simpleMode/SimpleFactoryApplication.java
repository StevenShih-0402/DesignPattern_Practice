package com.example.design.factory.simpleMode;

import com.example.design.factory.BaseCard;

public class SimpleFactoryApplication {

    public static void main(String[] args) {

        // 簡單工廠：透過物件去生產物件
        BaseCard minion = SimpleCardFactory.printCard("Minion");
        BaseCard magic = SimpleCardFactory.printCard("Magic");

        if (minion != null && magic != null) {
            minion.showType();
            magic.showType();
        }
    }
}
