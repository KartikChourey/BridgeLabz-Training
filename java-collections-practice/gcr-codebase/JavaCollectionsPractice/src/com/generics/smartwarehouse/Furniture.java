package com.generics.smartwarehouse;

class Furniture extends WarehouseItem {
    Furniture(String name) {
        super(name);
    }

    public String getCategory() {
        return "Furniture";
    }
}