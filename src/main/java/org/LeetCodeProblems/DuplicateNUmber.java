package org.example.draft;

public class Duplicate {
    public static void main(String[] args) {
        int[] nums = {3,3,3,3,3};
        System.out.println(findDuplicate(nums));
    }
    static int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int original = nums[i] - 1;
            if(nums[i] != nums[original]){
                swap(nums, i, original);
            }else i++;
        }
        for (int index = 0; index < nums.length; index++) {
           if(nums[index] != index + 1){
               return nums[index];
           }
        }
        return nums.length;
    }
    static void swap(int[] nums, int first, int second ){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
