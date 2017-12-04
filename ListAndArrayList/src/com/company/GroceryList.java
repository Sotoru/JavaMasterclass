package com.company;

import java.util.ArrayList;

public class GroceryList {

    private int[] myNumbers = new int[50];
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("you have " +groceryList.size() + "items in your grocerylis");
        for (int i=0; i<groceryList.size(); i++) {
            System.out.println((i+1) + " . " + groceryList.get(i));
        }
    }


    public void modifyGroceryItem(int position, String newItems) {
        groceryList.set(position,newItems);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }


    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);

    }
}
