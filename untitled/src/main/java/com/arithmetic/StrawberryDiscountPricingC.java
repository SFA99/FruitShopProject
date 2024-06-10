package com.arithmetic;

/**
 * 顾客C
 */
public class StrawberryDiscountPricingC implements PricingStrategy {
    @Override
    public double calculate(double applePounds, double strawberryPounds, double mangoPounds) {
        double strawberryPrice = Constants.STRAWBERRY_PRICE * Constants.STRAWBERRY_DISCOUNTED_RATE; // 草莓8折
        return applePounds * Constants.APPLE_PRICE + strawberryPounds * strawberryPrice + mangoPounds * Constants.MANGO_PRICE;
    }
}
