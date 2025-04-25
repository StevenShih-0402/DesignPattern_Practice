package com.example.design.factory.abstractMode;

import com.example.design.factory.abstractMode.fac.CardFactory;
import com.example.design.factory.abstractMode.fac.MagicCardFactory;

import java.util.Scanner;

public class AbstractFactoryApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 創建法術卡工廠
        CardFactory magicFactory = new MagicCardFactory();

        // 使用工廠創建卡片組件
        CardName name = magicFactory.createName();
        CardAttribute attribute = magicFactory.createAttribute();
        CardCost cost = magicFactory.createCost();
        CardEffect effect = magicFactory.createEffect();

        // 讓使用者輸入卡片資訊
        System.out.println("請輸入法術卡資訊：");

        System.out.print("請輸入卡片姓名：");
        String cardName = scanner.nextLine();
        name.setName(cardName);

        System.out.print("請輸入卡片費用：");
        int cardCost = scanner.nextInt();
        scanner.nextLine();  // 跳過一次輸入達到換行效果
        cost.setCost(cardCost);

        System.out.print("請輸入卡片效果：");
        String cardEffect = scanner.nextLine();
        effect.setEffect(cardEffect);

        System.out.print("請輸入卡片屬性：");
        String cardAttr = scanner.nextLine();
        attribute.setAttribute(cardAttr);

        // 顯示卡片資訊
        System.out.println("\n=== 卡片資訊 ===");
        name.showName();
        cost.showCost();
        effect.showEffect();
        attribute.showAttribute();

        scanner.close();
    }
}
