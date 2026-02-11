package org.example.Jan20;

import java.util.Arrays;

public class Passingfunctions {
    public static void main(String[] args) {
        int[] nums = {3, 4, 7, 21, 12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int[] arr){
        arr[2] = 33;
    }
}
