package org.example.Jan12;

import java.util.Scanner;

public class mainclas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, num;

        System.out.println("Enter num 1: ");
        num1 = in.nextInt();
        System.out.println("Enter num 2: ");
        num2 = in.nextInt();
        num = num1 + num2;
        System.out.println("The sum is equal : " + num);
    }
}
