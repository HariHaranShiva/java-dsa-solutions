package org.LeetCodeProblems;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 3, 123, 54, 7, 1267, -23};
      //  int nums = 123;
        System.out.println(findNumbers(nums));
    }

    //Extracting number of digits from array
    static int digits(int nums){

        if(nums<0){
            nums= nums * -1;
        }

        if(nums == 0){
            return 1;
        }
        int count = 0;
        while(nums>0){
            count++;
            nums /=10;
        }
        return count;
    }

    //Validating the digits are even or not
    static boolean isEven(int nums){
        int numofDigits = digits(nums);
        if(numofDigits % 2 == 0 ){
            return true;
        }
        return false;
    }

    // Counting number of Even Numbers
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(isEven(num)){
                count++;
            }
        }return count;
    }

}
