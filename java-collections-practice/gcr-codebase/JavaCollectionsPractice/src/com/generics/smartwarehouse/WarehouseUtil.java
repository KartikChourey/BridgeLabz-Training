package com.generics.smartwarehouse;
import java.util.*;
class WarehouseUtil {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.name + " (" + item.getCategory() + ")");
        }
    }
}