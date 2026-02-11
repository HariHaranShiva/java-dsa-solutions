package org.example.draft;

public class ReverseNum {
    public static void main(String[] args) {
       // Scanner in = new Scanner(Scanner.in);
        int num = 98597;
        int ans = 0;
//        while(num>0) {
//            int res = num % 10;
//            num /= 10;
//
//            ans = ans * 10 + res;
//
//        }
        while(num>0){
            int rem = num % 10;
            num /= 10;
             ans = ans * 10 + rem;

        }
        System.out.println(ans);
    }
}
