package com.arithmetic;

public class FruitShop {
    // 定义水果价格
    private static final double APPLE_PRICE = 8.0;
    private static final double STRAWBERRY_PRICE = 13.0;
    // 添加芒果价格
    private static final double MANGO_PRICE = 20.0;

    /**
     * 计算顾客A购买苹果和草莓的总价
     * @param applePounds 苹果的斤数
     * @param strawberryPounds 草莓的斤数
     * @return 总价
     */
    public static double calculateTotalForCustomerA(int applePounds, int strawberryPounds) {
        return applePounds * APPLE_PRICE + strawberryPounds * STRAWBERRY_PRICE;
    }


    /**
     * 计算顾客B购买苹果、草莓和芒果的总价
     * @param applePounds 苹果的斤数
     * @param strawberryPounds 草莓的斤数
     * @param mangoPounds 芒果的斤数
     * @return 总价
     */
    public static double calculateTotalForCustomerB(int applePounds, int strawberryPounds, int mangoPounds) {
        return applePounds * APPLE_PRICE + strawberryPounds * STRAWBERRY_PRICE + mangoPounds * MANGO_PRICE;
    }

    /**
     * 计算顾客C购买苹果、草莓（打8折）和芒果的总价
     * @param applePounds 苹果的斤数
     * @param strawberryPounds 草莓的斤数
     * @param mangoPounds 芒果的斤数
     * @return 总价
     */
    public static double calculateTotalForCustomerC(int applePounds, int strawberryPounds, int mangoPounds) {
        double strawberryDiscountedPrice = STRAWBERRY_PRICE * 0.8; // 草莓8折
        return applePounds * APPLE_PRICE + strawberryPounds * strawberryDiscountedPrice + mangoPounds * MANGO_PRICE;
    }

    /**
     * 计算顾客D购买苹果、草莓和芒果的总价，并应用满100减10的优惠
     * @param applePounds 苹果的斤数
     * @param strawberryPounds 草莓的斤数
     * @param mangoPounds 芒果的斤数
     * @return 总价
     */
    public static double calculateTotalForCustomerD(int applePounds, int strawberryPounds, int mangoPounds) {
        double totalBeforeDiscount = calculateTotalForCustomerC(applePounds, strawberryPounds, mangoPounds);
        return totalBeforeDiscount >= 100 ? totalBeforeDiscount - 10 : totalBeforeDiscount;
    }

    // 测试函数
    public static void main(String[] args) {
        double totalPrice = calculateTotalForCustomerA(2, 3); // 示例：购买2斤苹果，3斤草莓
        System.out.println("顾客A应付总价：" + totalPrice);
        // 这里应添加更多测试用例以验证函数的正确性
        double totalB = calculateTotalForCustomerB(10, 5, 3); // 假设购买10斤苹果、5斤草莓和3斤芒果
        System.out.println("顾客B的总价: " + totalB + "元"); // 应输出: 顾客B的总价: 235元

        // 测试问题3
        double totalC = calculateTotalForCustomerC(10, 5, 3); // 假设购买10斤苹果、5斤草莓（打8折）和3斤芒果
        System.out.println("顾客C的总价: " + totalC + "元"); // 应输出: 顾客C的总价: 218元

        // 测试问题4
        double totalD = calculateTotalForCustomerD(10, 5, 3); // 假设购买10斤苹果、5斤草莓（打8折）和3斤芒果
        System.out.println("顾客D的总价: " + totalD + "元"); // 应输出: 顾客D的总价: 208元
    }

}
