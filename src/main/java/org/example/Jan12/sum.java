package org.example.Jan12;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        sum();
        sum();
    }
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter num 2: ");
        int num2 = in.nextInt();
        int num = num1 + num2;
        System.out.println("The sum is equal : " + num);
    }
}
