package com.example.design.decorator;

public class DecoratorApplication {

	public static void main(String[] args) {

		// 創建基本飲料
		BaseDrink greenTea = new GreenTea();
		System.out.println("綠茶價格: " + greenTea.cost());

		// 添加珍珠
		BaseDrink greenTeaWithBubble = new BubbleDecorator(greenTea);
		System.out.println("綠茶加珍珠價格: " + greenTeaWithBubble.cost());

		// 添加椰果
		BaseDrink greenTeaWithCoconut = new CoconutDecorator(greenTea);
		System.out.println("綠茶加椰果價格: " + greenTeaWithCoconut.cost());

		// 同時添加珍珠和椰果
		BaseDrink greenTeaWithBubbleAndCoconut = new CoconutDecorator(new BubbleDecorator(greenTea));
		System.out.println("綠茶加珍珠和椰果價格: " + greenTeaWithBubbleAndCoconut.cost());

		// 再點一杯紅茶
		BaseDrink blackTea = new BlackTea();
		System.out.println("紅茶價格: " + blackTea.cost());

		// 如果想加一球冰淇淋
		BaseDrink blackTeaWithIceCream = new IceCreamDecorator(blackTea);
		System.out.println("紅茶加冰淇淋價格: " + blackTeaWithIceCream.cost());
	}
}
