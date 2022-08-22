package org.study.controller;

import org.study.model.Item;
import org.study.model.Seller;
import org.study.service.ItemService;
import org.study.service.SellerService;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Controller {

    private static final List<String> NAMES = Arrays.asList("Mel", "Li", "Braga",
            "Meggye", "Dennis");
    private static final Long ITEM_AMOUNT = 0L;
    private static final Double SALES_VALUE = 0.0;

    private static ItemService itemService = new ItemService();
    private static SellerService sellerService = new SellerService();

    public static void createItem() {
        Scanner scanner = new Scanner(System.in);
        Item item = new Item();
        try {
            System.out.print("Customer's name:   ");
            final String customerName = scanner.nextLine();
            item.setCustomerName(customerName);
            System.out.print("Item's name:  ");
            final String itemName = scanner.nextLine();
            item.setItemName(itemName);
            System.out.print("Sale's value:  ");
            final String saleValue = scanner.nextLine();
            item.setSaleValue(Double.parseDouble(saleValue));
            System.out.print("Seller's name: ");
            final String sellerName = scanner.nextLine();
            if (sellerService.verifySeller(sellerName)){
                Seller seller = sellerService.getByName(sellerName);
                item.setSeller(seller);
                item.getSeller().setItemAmount(item.getSeller().getItemAmount() + 1);
                item.getSeller().setSalesValue(item.getSeller().getSalesValue() + item.getSaleValue());
                itemService.addItems(item);
            }else{
                System.out.println("This is not a valid seller. Please, verify the options");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleteItem(){
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Item's name:   ");
            final String name = scanner.nextLine();
            itemService.delete(name);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public void insertSellers(){

        for (String name: NAMES) {
            if(sellerService.getSellers().size()<5){
                sellerService.add(name, ITEM_AMOUNT, SALES_VALUE);
            }
        }
    }

    public static void getSellers() {
        for (Seller seller: sellerService.getSellers()) {
            System.out.println(seller.getSeller());
        }
    }

    public static void getSellersByAmount() {
        System.out.println(itemService.orderSalesBySellerSalesAmount());

    }

    public static void getItems() {
        itemService.orderSalesBySellerAmountSalesValue();
        itemService.getItems();

    }
}
