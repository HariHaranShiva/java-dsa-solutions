package org.example.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 2, 1};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cycle(int[] arr){
        int i =0;
        while (i < arr.length){
           int correctIndex = arr[i] - 1;

           //tiny upgrade
         //  if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]){

           if(arr[i] != arr[correctIndex]){
               swap(arr,i, correctIndex);
           }
           else i++;
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
