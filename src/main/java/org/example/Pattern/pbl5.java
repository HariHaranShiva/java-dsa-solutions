package org.example.Pattern;

public class pbl5 {

    public static void main(String[] args) {
        pattern4(4);
    }
    static void pattern1(int n){
        //int num = 2 * n;
        for (int row = 0; row < 2 * n ; row++) {
            int noOfCol = row > n ? 2 * n - row  : row;
            for (int col = 0; col < noOfCol ; col++) {
                System.out.print( "* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        //int num = 2 * n;
        for (int row = 0; row < 2 * n ; row++) {
            int noOfCol = row > n ? 2 * n - row  : row;

            int totalNoSPace = n - noOfCol;
            for (int s = 0; s < totalNoSPace; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < noOfCol ; col++) {
                System.out.print( "* ");
            }
            System.out.println();
        }
    }
    
    static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            int totalSpace = n - row;
            for (int s = 0; s < totalSpace; s++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
       // System.out.println();
    }

    static void pattern4(int n){
        int originalN = n;
        n = 2 * n - 1;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n  ; col++) {
                int atEveryIndex =originalN -  Math.min(Math.min(row , col ), Math.min(n-1-row, n-1- col));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
