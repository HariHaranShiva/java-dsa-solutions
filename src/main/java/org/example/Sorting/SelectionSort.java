package org.example.Sorting;

import java.util.Arrays;

public class SelectionSort  {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,4};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i -1;
            int maxIndex = getMaxIndex(arr,  0 , last);
            Swap(arr, maxIndex, last);
        }
    }

     static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
         for (int i = start; i <= end; i++) { // start=0 end=3
             if(arr[max] < arr[i]){
                 max = i;
             }
         }
         return max;
    }
    static void Swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
