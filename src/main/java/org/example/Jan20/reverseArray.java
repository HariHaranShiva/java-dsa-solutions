package org.example.Jan20;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {2, 49, 6, 23, 4, 60};
       //swap(arr, 2, 4);
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
       int temp = arr[index1];
       arr[index1]= arr[index2];
       arr[index2] = temp;

    }
    static void rev(int[] arr){
        int start =0;
        int end = arr.length-1;
        while(start<end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

}
