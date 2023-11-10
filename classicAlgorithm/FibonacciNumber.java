package classicAlgorithm;

public class FibonacciNumber {
    public int solution1(int number){
        if(number == 0){
            return 0;
        }
        if(number == 1){
            return 1;
        }
        return solution1(number - 1 ) + solution1(number - 2);
    }

    public int solution2(int number){
        if(number == 0 ) return 0;
        if(number == 1) return 1;
        int number1 = 0;
        int number2 = 1;
        int sum = number1 + number2;
        while( number > 1){
            sum = number1 + number2;
            number1 = number2;
            number2 = sum;

            number--;
        }
        return sum;
    }






    public static void main(String[] args) {
        long startTime= System.currentTimeMillis();
        System.out.println(new FibonacciNumber().solution1(30));
        long endtime = System.currentTimeMillis();
        System.out.println("time : " + (endtime - startTime));
        System.out.println();

        long startTimes= System.currentTimeMillis();
        System.out.println(new FibonacciNumber().solution2(5));
        long endtimes = System.currentTimeMillis();
        System.out.println("time : " + (endtimes - startTimes));

        int n = 10;
        for(int i = 0; i < n; i++){
            System.out.print(new FibonacciNumber().solution1(i) + " ");
        }
    }


}
