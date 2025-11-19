package com.amigocode;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args){
        String[] arrays= new String[5];
        arrays[1] = "CSK";
        arrays[3] = "RCB";

        System.out.println(Arrays.toString(arrays));

        for(String array : arrays){
            System.out.println(array);
        }




    }
}
