package org.Jan21;

public class SmallestNUm {
    public static void main(String[] args) {
        int[] arr = {12, 32, 4, 1, -10, 8, -13, 2};
        System.out.println(search(arr));
    }
    static int search(int[] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (ans>arr[i]){
                ans = arr[i];

            }
        }return ans;
    }
}
