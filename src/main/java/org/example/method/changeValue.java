package org.example.method;

import java.util.Arrays;

public class changeValue {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 89, 23};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void change(int[] nums) {
        nums[0] = 99;
    }


}
