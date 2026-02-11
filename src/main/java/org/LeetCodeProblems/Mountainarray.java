package org.LeetCodeProblems;
// https://leetcode.com/problems/peak-index-in-a-mountain-array/
// https://leetcode.com/problems/find-peak-element/submissions/1900944479/
public class Mountainarray {
    public static void main(String[] args) {
        int[]  arr = {0, 2, 3, 5, 6, 4, 2, 0};
        System.out.println(peakIndexInMountainArray(arr));
    }


    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){  // 8 > 6
                end  = mid;
            }
            else {
                start = mid + 1; // Because we know that mid+1 element > mid element
            }
        }
        // in the end start == end and pointing to the largest number because of the two checks
        // hance they are pointing to one element, that is going to be maximum element
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying one item remaining, hence cuz of the above line
        return  start;
    }
}
