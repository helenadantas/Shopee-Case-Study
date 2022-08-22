package org.study.repository;

import org.study.model.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemRepository {

    protected static List<Item> itemList = new ArrayList<>();

    public static List<Item> getItemList() {
        return itemList;
    }

    public static void addItemList(Item item) {
        itemList.add(item);
    }
    public static void setItemList(List<Item> itemList) {
        ItemRepository.itemList = itemList;
    }

    public static void getItems() {
        for (Item item : itemList) {
            System.out.println(item.toString());
        }
    }

    public static void deleteItemList(String name) {
        for (Item item : itemList) {
            if(item.getItemName().equals(name)){
                itemList.remove(item);
                break;
            }
        }
    }
}
