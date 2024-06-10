package com.arithmetic;

/**
 * 顾客D
 */
public class FullReductionPricingD implements PricingStrategy {
    @Override
    public double calculate(double applePounds, double strawberryPounds, double mangoPounds) {
        double total = applePounds * Constants.APPLE_PRICE + strawberryPounds * Constants.STRAWBERRY_PRICE + mangoPounds * Constants.MANGO_PRICE;
        return total >= Constants.DISCOUNT_THRESHOLD ? total - Constants.DISCOUNT_AMOUNT : total;
    }
}
