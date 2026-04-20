package org.example.draft;

public class getEvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 3, 123, 54, 7, 126, -23};
        System.out.println(countDigits(nums));
    }
    static int digits(int nums){
        int digits = 0;

        if(nums < 0){
            nums = nums * -1;
        }

        while(nums > 0){
            digits ++;
            nums /= 10;
        }
        return digits;
    }

    static boolean isEven(int nums){
        int count = digits(nums);
        return count % 2 == 0;
    }

    static int countDigits(int[] nums){
        int count  = 0;
        for(int num : nums){
            if(isEven(num)){
                count++;
            }
        }
        return count;
    }
}
