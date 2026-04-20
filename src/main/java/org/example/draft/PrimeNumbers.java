package org.example.draft;

public class PrimeNumbers {
    public static void main(String[] args) {
        int num = 17;
        System.out.println(isPrime(num));
    }

    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for (int i = 2; i * i <= num ; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

}
