package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //parallel array of items and corresponding quantities. Display this to the user.
        String[] items = {"Hot dog", "Bratwurst", "Hamburger", "Fries", "Soda"};
        int[] quantity = {5, 6, 4, 10, 14};
        System.out.println("-------------------");
        System.out.println("Initial quantities:");
        System.out.println("-------------------");
        //for loop to display the items and the corresponding quantities
        for (int index = 0; index < items.length; index++) {
            System.out.println("You have " + quantity[index] + " " + items[index] + " in stock.");
        }
        //call the menu method and pass the 2 arrays
        menu(items, quantity);
    }

    private static void menu(String[] item1, int[] quantity1){
        Scanner choice = new Scanner(System.in);
        //a variable to hold the selection from the user
        int option;
        //a do-while loop to hold selection of operations that can be performed on the inventory.
        do {
            System.out.println("\n-----------------------------------------------------");
            System.out.println("Please enter the operation you would like to perform:");
            System.out.println("-----------------------------------------------------");
            System.out.println("1: Check Stock.");
            System.out.println("2: Restock Item.");
            System.out.println("3: Sell Item.");
            System.out.println("4: Quit.");
            //get menu option from the user
            option = choice.nextInt();
        }while(option != 1 && option != 2 && option != 3 && option != 4);
        //a switch statement that will display the users option and call the relevant method.
        switch (option)
        {
            case 1:
                System.out.println("\nYou selected to view the current stock quantities.");
                check(item1, quantity1);
                break;
            case 2:
                System.out.println("\nYou selected  to restock an item of stock.");
                add(item1, quantity1);
                break;
            case 3:
                System.out.println("\nYou selected to sell an item of stock.");
                sell(item1, quantity1);
                break;
            case 4:
                System.out.println("\nYou selected to quit the program.");
                System.out.println("Have a nice day.");
                break;
        }
    }

    //a method to display the item and to corresponding quantity
    private static void check(String[] item, int[] quantity) {
        Scanner choice = new Scanner(System.in);
        //variables to hold the selection from the user and the position in the arrays to be accessed
        int option;
        int pos;
        //a do-while loop to display selection of which items and quantities to be displayed, while a valid option
        //is not valid
        do {
            System.out.println("--------------------------------------");
            System.out.println("Which item would you like stock check:");
            System.out.println("--------------------------------------");
            System.out.println("1: Hot Dog.");
            System.out.println("2: Bratwurst.");
            System.out.println("3: Hamburger.");
            System.out.println("4: Fries.");
            System.out.println("5: Soda.");
            System.out.println("6: All");
            System.out.println("7: Exit Back to Menu.");
            //get menu option from the user
            option = choice.nextInt();
        }
        while (option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option != 6 && option != 7);
        //a switch statement that will display the users option and display the queried values and call the menu method.
        switch (option) {
            case 1:
                pos = 0;
                System.out.println("\nYou selected to view the quantity of stock of " + item[pos] + ".");
                System.out.println("You have " + quantity[pos] + " " + item[pos] + " in stock.");
                menu(item, quantity);
                break;
            case 2:
                pos = 1;
                System.out.println("\nYou selected to view the quantity of stock of " + item[pos] + ".");
                System.out.println("You have " + quantity[pos] + " " + item[pos] + " in stock.");
                menu(item, quantity);
                break;
            case 3:
                pos = 2;
                System.out.println("\nYou selected to view the quantity of stock of " + item[pos] + ".");
                System.out.println("You have " + quantity[pos] + " " + item[pos] + " in stock.");
                menu(item, quantity);
                break;
            case 4:
                pos = 3;
                System.out.println("\nYou selected to view the quantity of stock of " + item[pos] + ".");
                System.out.println("You have " + quantity[pos] + " " + item[pos] + " in stock.");
                menu(item, quantity);
                break;
            case 5:
                pos = 4;
                System.out.println("\nYou selected to view the quantity of stock of " + item[pos] + ".");
                System.out.println("You have " + quantity[pos] + " " + item[pos] + " in stock.");
                menu(item, quantity);
                break;
            //a case to query all items using a for loop
            case 6:
                System.out.println("-------------------");
                System.out.println("Current Quantities:");
                System.out.println("-------------------");
                for (int index = 0; index < item.length; index++) {
                    System.out.println("You have " + quantity[index] + " " + item[index] + " in stock.");
                }
                menu(item, quantity);
                break;
            //a case to exit back to the menu method without querying items
            case 7:
                System.out.println("\nYou selected to exit back to menu.");
                menu(item, quantity);
                break;
        }
    }

    //a method to increase the amounts of an item
    private static void add(String[] item, int[] quantity){
        Scanner choice = new Scanner(System.in);
        //variables to hold the users selection, the quantity to be modified by and the position in the array to be
        //modified and the original value of the quantity
        int option;
        int pos;
        //a do-while loop to display selection of which items to be modified, while a valid option is not valid
        do {
            System.out.println("-------------------------------------");
            System.out.println("Which item would you like to restock:");
            System.out.println("-------------------------------------");
            System.out.println("1: Hot Dog.");
            System.out.println("2: Bratwurst.");
            System.out.println("3: Hamburger.");
            System.out.println("4: Fries.");
            System.out.println("5: Soda.");
            System.out.println("6: Exit Back to Menu.");
            //get menu option from the user
            option = choice.nextInt();
        }while(option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option != 6);
        //a switch statement set the position in the array based on the users selection. It will then call the addCalc
        // method passing the item and quantity arrays as well as the position in the array selected by the user
        switch (option)
        {
            case 1:
                pos = 0;
                addCalc(item, quantity, pos);
                break;
            case 2:
                pos = 1;
                addCalc(item, quantity, pos);
                break;
            case 3:
                pos = 2;
                addCalc(item, quantity, pos);
                break;
            case 4:
                pos = 3;
                addCalc(item, quantity, pos);
                break;
            case 5:
                pos = 4;
                addCalc(item, quantity, pos);
                break;
            //a case to exit back to the menu without modifying the quantities of any items
            case 6:
                System.out.println("\nYou selected to exit back to menu.");
                menu(item, quantity);
                break;
        }
    }

    //a method to decrease the amounts of an item
    private static void sell(String[] item, int[] quantity){
        Scanner choice = new Scanner(System.in);
        //variables to hold the users selection, the quantity to be modified by and the position in the array to be
        //modified
        int option;
        int pos;
        //a do-while loop to display selection of which items to be modified, while a valid option is not valid
        do {
            System.out.println("----------------------------------");
            System.out.println("Which item would you like to sell:");
            System.out.println("----------------------------------");
            System.out.println("1: Hot Dog.");
            System.out.println("2: Bratwurst.");
            System.out.println("3: Hamburger.");
            System.out.println("4: Fries.");
            System.out.println("5: Soda.");
            System.out.println("6: Exit Back to Menu.");
            //get menu option from the user
            option = choice.nextInt();
        }while(option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option != 6);
        //a switch statement set the position in the array based on the users selection. It will then call the sellCalc
        // method passing the item and quantity arrays as well as the position in the array selected by the user
        switch (option)
        {
            case 1:
                pos = 0;
                sellCalc(item, quantity, pos);
                break;
            case 2:
                pos = 1;
                sellCalc(item, quantity, pos);
                break;
            case 3:
                pos = 2;
                sellCalc(item, quantity, pos);
                break;
            case 4:
                pos = 3;
                sellCalc(item, quantity, pos);
                break;
            case 5:
                pos = 4;
                sellCalc(item, quantity, pos);
                break;
            //a case to exit back to the menu without modifying the quantities of any items
            case 6:
                System.out.println("\nYou selected to exit back to menu.");
                menu(item, quantity);
                break;
        }
    }

    //a method to perform the add calculation to the quantity array
    private static void addCalc(String[] item, int[] quantity, int pos){
        Scanner choice = new Scanner(System.in);
        //initialize variables to hold the original quantity of an item and the amount modify the original quantity by
        int amount;
        int ph = quantity[pos];
        //display to user they select to add the selected item
        System.out.println("\nYou selected to increase the stock of " + item[pos] + ".");
        //a do-while loop to display request amount to add while the value give is not less than zero
        do {
            System.out.println("How many would you like to add to the current stock amount: ");
            amount = choice.nextInt();
        }while (amount < 0);
        //increase the original quantity by the value given by user
        quantity[pos] += amount;
        //display to the user the original quantity, the quantity added, and the new total
        System.out.println("You originally had " + ph + " " + item[pos] + " in stock.");
        System.out.println("You added " + amount + " " + item[pos] + ".");
        System.out.println("You now have " + quantity[pos] + " " + item[pos] + " in stock.");
        //call the menu method and pass the item and quantity arrays
        menu(item, quantity);
    }

    //a method to perform the sell calculation to the quantity array
    private static void sellCalc(String[] item, int[] quantity, int pos){
        Scanner choice = new Scanner(System.in);
        //initialize variables to hold the original quantity of an item and the amount modify the original quantity by
        int amount;
        int ph = quantity[pos];
        //display to user they select to sell the selected item
        System.out.println("\nYou selected to sell some " + item[pos] + ".");
        //a do-while loop to display request amount to sell while the value give is not less than zero
        do {
            System.out.println("How many " + item[pos] +" did you sell: ");
            amount = choice.nextInt();
        }while (amount < 0);
        //if selling that amount would drop quantity below zero
        if (quantity[pos] - amount < 0){
            //set quantity to zero
            quantity[pos] = 0;
            //display an error that that amount can not be taken from stock
            //display the original quantity, the quantity taken away, and the new total
            System.out.println("Error: You only had " + ph + " in stock.");
            System.out.println("You sold " + ph + " " + item[pos] + ".");
            System.out.println("You now have " + quantity[pos] + " " + item[pos] + " in stock.");
        }
        else {
            //else if the quantity would not be reduced below zero
            quantity[pos] -= amount;
            //display the original quantity, the quantity taken away, and the new total
            System.out.println("You originally had " + ph + " " + item[pos] + " in stock.");
            System.out.println("You sold " + amount + " " + item[pos] + ".");
            System.out.println("You now have " + quantity[pos] + " " + item[pos] + " in stock.");
        }
        //call the menu method and pass the item and quantity arrays
        menu(item, quantity);
    }
}