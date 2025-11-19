package org.example;

public class CountNums {
    public static void main(String[] args) {
        int n = 7679;

        int count = 0;
        while (n>0){
            int rem = n % 10;
            if(rem == 1){
                count++;
            }
            n = n / 10;

        }
        System.out.println(count);

    }
}
