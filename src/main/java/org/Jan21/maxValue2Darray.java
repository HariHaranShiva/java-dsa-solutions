package org.Jan21;

public class maxValue2Darray {
    public static void main(String[] args) {
        int[][] arr = {
                {12, 2, 5, 6},
                {34, 55, 7},
                {5, 7, 23, 80},
                {1, 13}
        };
        System.out.println(max(arr));
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] row : arr){
            for(int col : row){
                if(col > max){
                    max = col;
                }
            }
        }
        return max;
    }

}
