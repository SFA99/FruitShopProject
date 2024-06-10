package com.arithmetic;

/**
 * 策略上下文
 */
public class FruitShopContext {
    private PricingStrategy strategy;

    public FruitShopContext(PricingStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateTotal(double applePounds, double strawberryPounds, double mangoPounds) {
        return strategy.calculate(applePounds, strawberryPounds, mangoPounds);
    }
}
