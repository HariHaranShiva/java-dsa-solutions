package org.tut;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String Company = in.next();

        switch (empID){
            case 1 -> System.out.println("Hari Haran");
            case 2 -> System.out.println("Nova Josh");
            case 3 -> {
                System.out.println("Nikki Jonas");
             switch (Company){
                case "Atmecs" -> System.out.println("ASPIRE");
                case "SutherLand" -> System.out.println("Welcome to Sutherland");
            }
        }}

    }
}
