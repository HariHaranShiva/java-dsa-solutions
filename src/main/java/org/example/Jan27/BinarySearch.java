package org.example.Jan27;

import java.util.Arrays;

public class BinarySearch  {
    public static void main(String[] args) {
      //  int[] arr = {2,4,5,9,10,13,23,25};
        int[] arr = {25,23,12,10,9,5,4,2};

        int target = 23;
        System.out.println(binarySearch(arr, target));

    }
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] < target){
                start = mid + 1;

            }
            else if (arr[mid] > target){
                end = mid-1;
            }
            else {
                return mid;
            }
//            if (arr[mid] == target) return mid;
//            else if (arr[mid] < target) start = mid + 1;
//            else end = mid - 1;

        }
        return -1;
    }

}
