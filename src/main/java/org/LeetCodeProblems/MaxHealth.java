package org.LeetCodeProblems;

import java.util.Arrays;

public class MaxHealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 4, 1}};
       // int ands = maximumWealth(accounts);
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (max < sum) {
                max = sum;
            }
        }
        return max;
    }
}
