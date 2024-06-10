package com.arithmetic;

public class FruitShop {
    public static void main(String[] args) {
        // 顾客A
        FruitShopContext contextA = new FruitShopContext(new BasicPricingA());
        System.out.println("顾客A应付总价：" + contextA.calculateTotal(2, 3, 0)); // 示例：购买2斤苹果，3斤草莓

        // 顾客B
        FruitShopContext contextB = new FruitShopContext(new CalculateTotalPriceB());
        System.out.println("顾客B应付总价：" + contextB.calculateTotal(5, 5, 5)); // 示例：购买5斤苹果，5斤草莓，5斤芒果

        // 顾客C
        FruitShopContext contextC = new FruitShopContext(new StrawberryDiscountPricingC());
        System.out.println("顾客C应付总价：" + contextC.calculateTotal(2, 3, 0)); // 示例：购买2斤苹果，3斤草莓

        // 顾客D
        FruitShopContext contextD = new FruitShopContext(new FullReductionPricingD());
        System.out.println("顾客D应付总价：" + contextD.calculateTotal(5, 5, 5)); // 示例：购买5斤苹果，5斤草莓，5斤芒果

    }
}
