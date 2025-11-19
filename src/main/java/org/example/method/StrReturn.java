package org.example.method;

import java.util.Scanner;

public class StrReturn {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = in.next();
        String personalised = myGreet(name);

      //  int ans = sum3(20, 30);
        System.out.println(personalised);
    }

    private static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }
    //sum int
   /*
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }

    */




}
