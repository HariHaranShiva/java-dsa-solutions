package org.example.draft;

public class Palindrom {
    public static void main(String[] args) {
        int num = 121;
        System.out.println(isPalindrome(num));
    }
    static boolean isPalindrome(int num) {

        int original = num;
        int reminder = 0;
        while(num > 0){
            int rem = num % 10;
             reminder = reminder * 10 + rem;
             num /= 10;
        }

        return original == reminder;
    }

}
