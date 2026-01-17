package com.generics.dynamiconlinemarketplace;
class DiscountUtil {

    public static <T extends Product<?>> void applyDiscount(T product, double percent) {
        product.price -= product.price * percent / 100;
    }
}