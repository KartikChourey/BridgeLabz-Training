package com.generics.smartwarehouse;

abstract class WarehouseItem {
    String name;

    WarehouseItem(String name) {
        this.name = name;
    }

    abstract String getCategory();
}