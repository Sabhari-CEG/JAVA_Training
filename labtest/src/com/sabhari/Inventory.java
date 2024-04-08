package com.sabhari;


public class Inventory {
    private String name;
    private double ItemCost;
    private int NoOfItems;


    public Inventory(String name,double ItemCost,int NoOfItems){
        this.name = name;
        this.ItemCost = ItemCost;
        this.NoOfItems = NoOfItems;
    }
    public void procureItems(int qty){
        System.out.println("Quantity present befor = "+this.NoOfItems);
        try {
            if (this.NoOfItems > 0){
                throw new IllegalArgumentException("No of items is gretaer than 0, so you can't add items to it");
            }
            this.NoOfItems += qty;
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());

        }
        System.out.println("Quantity after adding = "+this.NoOfItems);
    }

    public void sellItems(int qty){
        System.out.println("Quantity before selling = "+this.NoOfItems);
        try {
            if (qty > this.NoOfItems){
                throw new IllegalArgumentException("The sell item is greater than the actuall no of item");
            }
            this.NoOfItems -= qty;
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Quantity after selling = "+this.NoOfItems);
    }

    public void display(){
        System.out.println("Name of the item = "+this.name);
        System.out.println("Cost of the item = "+this.ItemCost);
        System.out.println("No of items = "+this.NoOfItems);
    }


}
