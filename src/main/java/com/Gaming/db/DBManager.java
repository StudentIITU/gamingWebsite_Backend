package com.Gaming.db;

import java.util.ArrayList;

public class DBManager {



    private static final ArrayList<Items> items = new ArrayList<>();

    static {
        items.add(new Items(1L, "Sword", 100));
        items.add(new Items(2L, "Shield", 100));
        items.add(new Items(3L, "Bow", 100));
        items.add(new Items(4L, "Arrow", 100));
    }

    private static long id = 5L;

    public static ArrayList<Items> getItems() {
        return items;
    }

    public static void addItem(Items item) {
        item.setId(id);
        items.add(item);
        id++;

        }

        public static Items getItems(Long id){
            for (Items item : items) {
                if (item.getId().equals(id)) {
                    return item;
                }
            }
            return null;
        }
}
