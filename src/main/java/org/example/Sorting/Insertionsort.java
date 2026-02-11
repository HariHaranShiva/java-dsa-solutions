package org.example.Sorting;

import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,4};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        //System.out.println(insertionSort(arr));;
    }
    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j =  i + 1; j > 0 ; j--) {
                if (arr[j] < arr[j - 1]){
                    sort(arr, j, j-1);

                }
                else break;
            }
        }
    }
    static void sort(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
