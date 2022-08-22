package org.study.service;


import org.study.model.Item;
import org.study.repository.ItemRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ItemService {

    public void addItems(Item item){
        ItemRepository.addItemList(item);
    }

    public List<Item> orderSalesBySellerSalesAmount() {
        ItemRepository.setItemList(ItemRepository.getItemList().stream().sorted(Comparator.comparing(Item::getSellerSalesAmount).reversed()).collect(Collectors.toList()));
        List<Item> list = ItemRepository.getItemList();
        return list;
    }

    public void orderSalesBySellerAmountSalesValue() {
        ItemRepository.setItemList(ItemRepository.getItemList().stream().sorted(Comparator.comparing(Item::getSellerValueSalesAmount).reversed()).collect(Collectors.toList()));
    }

     public void getItems(){
        ItemRepository.getItems();
     }

    public void delete(String name) {
        ItemRepository.deleteItemList(name);
    }
}
