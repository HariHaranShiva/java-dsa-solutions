package org.Jan21;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 2, 5, 6},
                {34, 55, 7},
                {5, 7, 23, 80},
                {1, 13}
        };
        int target = 1111;
        System.out.println(search(arr,target));
        System.out.println(Arrays.toString(search2(arr,target)));
    }
//return value
    static int search(int[][] arr, int target) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                //int ans = arr[row][col];
                if (anInt == target) {
                    //  int ans = arr[row][col];
                    return anInt;
                }
            }
        }
        return -1;
    }

    //return index of the element
    static int[] search2(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) return new int[]{row, col};
            }
        }
        return new int[]{-1, -1};
    }

}
