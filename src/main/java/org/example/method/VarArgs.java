package org.example.method;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
    //    fun(2, 4, 34, 5, 45, 9, 9, 90, 98, 78);
     //   multiple(3, 4, "hari", "perm", "velu");
        int sum  = fun(12,3,2);
        System.out.println(sum);
    }
//    static void multiple(int a, int b, String ...v){
//
//
//    }
//    static void fun(int ...v){
//        System.out.println(Arrays.toString(v));
//    }

    static int fun(int a, int b, int c) {
        return a + b - c;
    }
}
