package classicAlgorithm;

public class PalindromeNumber {


    public boolean solution(long number){
        if(number < 0 || number !=0 && number % 10 ==0 ) return false;
        long reverseNumber = 0;
        while( number > reverseNumber){
            long r = number %10;
            reverseNumber = reverseNumber * 10 + r;
            number = number /10;
        }
        return (number == reverseNumber || number == reverseNumber / 10);
    }


    public boolean solution2(long number){
        if(number < 0) return false;
        long reverseNumber =0, original = number;
        while (number != 0){
            long r = number % 10;
            reverseNumber = reverseNumber * 10 + r;
            number = number /10;
        }
        return original == reverseNumber;

    }



    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        long startTime= System.nanoTime();
        System.out.println(palindromeNumber.solution(12345678987654321L));
        long endtime = System.nanoTime();
        System.out.println("time : " + (endtime - startTime));
        System.out.println();
        long startTime2= System.nanoTime();
        System.out.println(palindromeNumber.solution2(12345678987654321L));
        long endtime2 = System.nanoTime();

        System.out.println("time : " + (endtime2 - startTime2));

    }




}
