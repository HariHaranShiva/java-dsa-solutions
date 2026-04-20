package org.example.draft;

public class SecLargest {
    public static void main(String[] args) {
        int[] arr = {2, 5, 12, 32, 44, 54, 47};
        System.out.println(secLarge(arr));
    }

    static int secLarge(int[] arr){
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > max){
                secMax = max;
                max = num;
            } else if (num > secMax && num != max) {
                secMax = num;
            }
        }
        return secMax;
    }
}
