package com.sabhari;

import java.util.Scanner;

public class InventoryTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the item name");
        String name = input.next();
        System.out.println("Enter the item cost");
        double cost = input.nextDouble();
        System.out.println("Enter the no of items");
        int noofitems = input.nextInt();
        Inventory inv1 = new Inventory(name,cost,noofitems);
        inv1.display();
        System.out.println("If you had sold the item, enter its quantity");
        int sold = input.nextInt();
        inv1.sellItems(sold);
        inv1.display();
        System.out.println("If you have added the item, enter its quantity");
        int add = input.nextInt();
        inv1.procureItems(add);
        inv1.display();
    }
}
