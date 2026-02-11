package org.example.Jan20;

public class secLargest {
    public static void main(String[] args) {
        int[] arr = {1, 7, 23, 5, 14};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > largest){
                second = largest;
                largest = num;

        } else if (second<num && num != largest) {
                second = num;
            }

            }
        System.out.println(second + " is the second largest number");
        }
}
