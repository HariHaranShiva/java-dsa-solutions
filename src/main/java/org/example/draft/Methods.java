package org.example.draft;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);

    }

    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 1st no: ");
        int num1 = in.nextInt();
        System.out.println("enter 2st no: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        return sum;
    }
//    static void sum(){
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter 1st no: ");
//        int num1 = in.nextInt();
//        System.out.println("enter 2st no: ");
//        int num2 = in.nextInt();
//
//        int sum = num1 + num2;
//        System.out.println("Sum is " + sum);
//
//    }
}
