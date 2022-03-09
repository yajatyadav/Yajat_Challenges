package com.company;
import java.io.*;
import java.util.Scanner;

public class Menu {

    public static void menu() {


        String[] menu_items = new String[] {"Option 1", "Option 2", "Option 3", "Option 4"};

        for(int i = 0; i < menu_items.length; i++){
            System.out.println(menu_items[i]);
            System.out.println("-------------------------\n");
        }

        System.out.println("Enter your choice:");

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();




        try {
            System.out.println(menu_items[Integer.parseInt(input)-1]);
        } catch (NumberFormatException e) {
            System.out.println("Make sure to enter a number as your choice!");
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Please enter a choice between 1 and " + menu_items.length);
        }

        menu();


    }

    public static void main(String[] args){
        Menu.menu();
    }

}
