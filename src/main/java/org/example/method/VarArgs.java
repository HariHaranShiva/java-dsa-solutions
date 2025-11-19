package org.example.method;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
    //    fun(2, 4, 34, 5, 45, 9, 9, 90, 98, 78);
        multiple(3, 4, "hari", "perm", "velu");
    }
    static void multiple(int a, int b, String ...v){


    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
