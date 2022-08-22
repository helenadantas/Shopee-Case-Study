package org.study.utils;

import org.study.controller.Controller;

import java.util.Scanner;

public class ManagerSales {
    public static Scanner scanner = new Scanner(System.in);

    public void getManagerSales() {

        int menuOption = 0;

        while (menuOption != -1) {
            System.out.println("Please, inform one option:");
            System.out.println("1 - Get sellers");
            System.out.println("2 - Create item to sale");
            System.out.println("3 - Get sales");
            System.out.println("4 - Get sales (by amount)");
            System.out.println("5 - Delete item");
            System.out.println("-1 - Exit From Marketplace");

            menuOption = scanner.nextInt();
            switch (menuOption) {
                case -1:
                    System.out.println("End");
                    scanner.close();
                    break;
                case 1:
                    Controller.getSellers();
                    System.out.print("\n");
                    break;
                case 2:
                    Controller.createItem();
                    System.out.print("\n");
                    Controller.getItems();
                    System.out.print("\n");
                    break;
                case 3:
                    Controller.getItems();
                    System.out.print("\n");
                    break;
                case 4:
                    Controller.getSellersByAmount();
                    System.out.print("\n");
                    break;
                case 5:
                    Controller.deleteItem();
                    System.out.print("\n");
                    break;
                default:
                    System.out.println("This is an invalid option.");
            }
        }
    }
}
