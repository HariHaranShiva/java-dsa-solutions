package org.example.Jan20;

public class maxValue {
    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 43, 2, 19};
        System.out.println(max(arr));

    }

    static int max(int[] arr) {
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }

        }
        return maxValue;
    }
}