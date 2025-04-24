# 裝飾器 (Decorator)

這個系統包含以下幾個部分：
- BaseDrink：飲料基類，定義了基本接口
- BlackTea：紅茶飲料
- GreenTea：綠茶飲料
  
- BaseDrinkDecorator：裝飾器基類，用於添加配料
- BubbleDecorator：珍珠配料裝飾器
- CoconutDecorator：椰果配料裝飾器
- IceCreamDecorator：冰淇淋配料裝飾器

![image](https://github.com/user-attachments/assets/0041ca21-5fe2-45bd-9057-21bb88043edc)

系統的主要特點：
1. 可以動態地為飲料添加配料
2. 配料可以自由組合
3. 每個配料都會影響最終價格
4. 保持了開閉原則 (OCP)，可以輕鬆添加新的配料


