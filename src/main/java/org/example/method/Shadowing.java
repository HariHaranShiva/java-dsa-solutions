package org.example.method;

public class Shadowing {
    static int x = 2;
    public static void main(String[] args) {
      //  System.out.println(x);
        int x = 20;
        System.out.println(x);
        fun();

    }

    static void fun(){
        int x = 90;
        System.out.println(x);

    }

}
