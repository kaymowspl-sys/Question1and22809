/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @ST10510570
 */

import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Select the beverage type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");
        System.out.println("");
        
         // Straight forward enter
        int choice = sc.nextInt();
        sc.nextLine();

        String consoleType = "";
        if(choice == 1) consoleType = "PS5";
        if(choice == 2) consoleType = "XBOX";
        if(choice == 3) consoleType = "SWITCH";

        System.out.print("Enter the store: ");
        String store = sc.nextLine();

        System.out.print("Enter the total sales of " + consoleType + " consoles for " + store + ":");
        int total = sc.nextInt();

        ConsoleSales sale = new ConsoleSales(consoleType, store, total);
        sale.printReport();
    }
}