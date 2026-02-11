package org.example.Jan29;

import com.sun.source.tree.BreakTree;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 8, 10, 100, 130, 150, 160, 180};
        int target = 100;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target){
        int start = 0;
        int end =1;

        while(target > arr[end]){
            int temp = end + 1;

            end = end + (end - start) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end-start)/2;
            if (arr[mid] < target){
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
            else{
                return mid;
            }
        } return -1;
    }

}
