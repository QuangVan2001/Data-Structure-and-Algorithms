package leetcode;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public boolean[] solution(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);

        for(int i = 2; i*i <= n; i++){
            if(isPrime[i]){
                for(int p = i*i ; p <=n; p+=i){
                    isPrime[p] = false;
                }
            }
        }
        return isPrime;
    }



    public static void main(String[] args) {
        SieveOfEratosthenes sieveOfEratosthenes = new SieveOfEratosthenes();
        int n = 10;
        boolean[] isPrime = sieveOfEratosthenes.solution(n);

        System.out.println("Các số nguyên tố trong khoảng từ 2 đến " + n + " là:");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }

    }
}
