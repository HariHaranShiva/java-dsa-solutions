package org.example.Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class StringExp {
    public static void main(String[] args) {
        String a = "lion";
        String b = "lion";

        String c = new String("Tiger");
        String d = new String("Tiger");
//        System.out.println("Lion");
//        System.out.println(123);
//        System.out.println(Arrays.toString(new int[]{2,3,5,7,0}));
//        System.out.println(Arrays.toString(new int[]{2,3,5,7,0}));
        System.out.println('a' + 'b');
        System.out.println("a" + 1);
        //integer will be converted to Integer that call toString()
        System.out.println("Hari" + new ArrayList<>());
        System.out.println("hari " + new Integer(54));
        // '+' operator will only works for String and either one String should be there to run

    }

}
