package org.example.draft;

import java.util.Scanner;

public class SwitchNestedCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String Department = in.next();

//        String fruit = in.next();
//
//        switch (fruit) {
//            case "mango" -> System.out.println("king of fruit 🍋");
//            case "apple" -> System.out.println("red colour fruit 🍎");
//            case "berry" -> System.out.println("berrys 🍒");
//            default -> System.out.println("please enter valid fruit 🧐");
//        }

        //Nested Switch
        switch (empID) {
            case 1 -> System.out.println("Hari Haran");
            case 2 -> System.out.println("Nova Josh");
            case 3 -> System.out.println("Emp number 3");
            default -> System.out.println("Invalid ID");
        }
            switch (Department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }

//            default -> System.out.println("Invalid ID");
        }

    }
    