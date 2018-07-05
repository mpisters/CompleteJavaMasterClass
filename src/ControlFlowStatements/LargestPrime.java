package ControlFlowStatements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestPrime {
    public static void main(String[] args) {
    }

    public static int getPrimes(int number) {
        if (number < 2) {
            return -1;
        }
        List<Integer> primes = new ArrayList<Integer>();
        for (int i = number; i >= 0; i--) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }
        return getLargestPrime(primes, number);
    }

    public static int getLargestPrime(List<Integer> primes, int number){
        int temp = 0;
        int finalPrime = 0;
        for (int i = 0; i < primes.size(); i++){
            if (number % primes.get(i) > temp){
                temp = number / primes.get(i);
                finalPrime = primes.get(i);
            }
        }
        return finalPrime;
    }

    public static boolean isPrime(int n) {
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

}
