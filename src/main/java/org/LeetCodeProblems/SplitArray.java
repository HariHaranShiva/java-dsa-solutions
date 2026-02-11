package org.LeetCodeProblems;

public class SplitArray {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;

        System.out.println(splitArray(nums, k));
    }
    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int j : nums) {
            start = Math.max(start, j); // in the end it will contains MAX item from the array
            end += j;
        }

        while(start < end){
            //try for the middle as my potential answer
            int mid = start + (end - start) / 2;

            //calculate how many pieces you can divide thius in with max sum

            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum + num > mid){
                    // cannot add in this sub array , make new one
                    //say you add this to new array
                    sum = num;
                    pieces++;
                }
                else{
                    sum += num;

                }

            }
            if(pieces > k){
                start = mid + 1;
            }else end = mid;
        }
         return end; //start is == end
    }
}
