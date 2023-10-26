package leetcode;

public class GCD {

    /*
    * GCD(a, b)  {
    * = a neu b = 0
    * = GCD (b, a % b)
    * và a^2 +b^2 != 0
    * và a >=0 , b>=0
    * */
    public int solution(int a, int b){
        while(b > 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public int solution2(int a, int b){
        if(b == 0){
            return a;
        }
        return solution2(b, a %  b);
    }

    public static void main(String[] args ){
        GCD gcd = new GCD();
        long startTime = System.currentTimeMillis();
        int result = gcd.solution(16, 64);
        long endTime = System.currentTimeMillis();
        System.out.println("Result for solution 1 : " + result);
        System.out.println(" Execution time : " + (endTime - startTime) + " milliseconds");
        System.out.println();
        long startTimes = System.currentTimeMillis();
        int results = gcd.solution2(16, 64);
        long endTimes = System.currentTimeMillis();
        System.out.println("Result for solution 2 : " + results);
        System.out.println(" Execution time : " + (endTimes - startTimes) + " milliseconds");
    }
}

