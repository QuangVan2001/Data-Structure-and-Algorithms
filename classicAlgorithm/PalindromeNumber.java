package classicAlgorithm;

import javax.swing.*;

public class PalindromeNumber {


    public boolean solution(int number){
        if(number < 0 || number !=0 && number % 10 ==0 ) return false;
        int reverseNumber = 0;
        while( number > reverseNumber){
            int r = number %10;
            reverseNumber = reverseNumber * 10 + r;
            number = number /10;
        }
        return (number == reverseNumber || reverseNumber == number / 10);
    }


    public boolean isPalindrome(int x) {
        if(x < 0 || x !=0 && x % 10 == 0) return false;
        int result = 0;
        while(x > result){
            int r = x % 10;
            result = result * 10 + r;
            x = x/ 10;
        }
        return (x == result || x == result /10);
    }


    public boolean solution2(int number){
        if(number < 0) return false;
        int reverseNumber =0, original = number;
        while (number != 0){
            int r = number % 10;
            reverseNumber = reverseNumber * 10 + r;
            number = number /10;
        }
        return original == reverseNumber;

    }





    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
       // long startTime= System.nanoTime();
        System.out.println(palindromeNumber.isPalindrome(12321));
//        long endtime = System.nanoTime();
//        System.out.println("time : " + (endtime - startTime));
//        System.out.println();
//        long startTime2= System.nanoTime();
//        System.out.println(palindromeNumber.solution2(1000000));
//        long endtime2 = System.nanoTime();
//
//        System.out.println("time : " + (endtime2 - startTime2));

    }




}
