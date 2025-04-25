package com.example.design.factory.simpleMode;

import com.example.design.factory.BaseCard;
import com.example.design.factory.MagicCard;
import com.example.design.factory.MinionCard;

public class SimpleCardFactory {

    public static BaseCard printCard(String type){
        return switch (type) {
            case "Minion" -> {
                System.out.println("建立一張手下。");

                // Switch express 多行語句的回傳值使用 yield，效果跟 return 一樣，但只能用在 switch，解決原本需要 break 的寫法。
                yield new MinionCard();
            }
            case "Magic" -> {
                System.out.println("建立一張法術。");
                yield new MagicCard();
            }
            default -> null;
        };
    }
}