package classicAlgorithm;

public class ReverseNumber {
    public int solution(int num){
        int result = 0;
        while(num != 0){
            int r = num % 10;
            result = result * 10 + r;
            num = num/ 10;
        }
        return result;
    }




    public static void main(String[] args) {
        long startTime= System.currentTimeMillis();
        System.out.println(new ReverseNumber().solution(12345678));
        long endtime = System.currentTimeMillis();
        System.out.println("time : " + (endtime - startTime));
    }



}
