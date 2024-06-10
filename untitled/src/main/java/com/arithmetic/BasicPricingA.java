package com.arithmetic;


/**
 * 顾客A
 */
public class BasicPricingA implements PricingStrategy {
    @Override
    public double calculate(double applePounds, double strawberryPounds, double mangoPounds) {
        return applePounds * Constants.APPLE_PRICE + strawberryPounds * Constants.STRAWBERRY_PRICE + mangoPounds * Constants.MANGO_PRICE;
    }
}
