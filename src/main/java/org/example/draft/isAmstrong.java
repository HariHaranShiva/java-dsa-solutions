package org.example.draft;

public class isAmstrong {
    public static void main(String[] args) {
        int num = 153;
        System.out.println(isAmstrong(num));
    }

    static boolean isAmstrong(int num){
        int original = num;
        int temp = num;
        int digit = 0;
        int sum = 0;

        while(temp > 0){
            digit ++;
            temp /= 10;
        }
       temp = num;
        while(temp > 0){

            int digits = temp % 10;
            sum += Math.pow(digits, digit);
            temp /= 10;

        }
        return sum == original;
    }
}
