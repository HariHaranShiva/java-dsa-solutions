package org.LeetCodeProblems;
// https://leetcode.com/problems/search-in-rotated-sorted-array/
public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
      //  int[] nums = {0, 1, 2, 4, 5, 6, 7};
        int target = 0;
       System.out.println(search(nums, target));
    //    System.out.println(countRotation(nums));
    }

    // Counting number of Rotations
    static int countRotation(int[] arr){
        int pivot = findpivot(arr);
        return pivot +1;
    }

    // Searching the target element with the pivot value in the ** binarySearch ** method
    static int search(int[] nums, int target) {
        int pivot = findpivot(nums);

        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot-1);
        }
        return binarySearch(nums, target, pivot+1, nums.length-1);
    }

    // Searching for target element
    static int binarySearch(int[] nums, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;

            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // Finding the pivot value in the rotation array
        static int findpivot(int[] arr){
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (mid < end && arr[mid] > arr[mid + 1]) {
                    return mid;
                }
                if (mid > start && arr[mid] < arr[mid - 1]) {
                    return mid - 1;
                }
                if (arr[mid] <= arr[start]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return -1;
        }

    }
