package leetcode.leetcode75.DP_1D;

public class N_th_Tribonacci_Number {
    public int tribonacci(int n) {
        if(n == 0 ) return 0;
        if(n==1) return 1;
        if(n== 2) return 1;
        int number1 = 0;
        int number2=1;
        int number3 = 1;
        int number4 = number1+number2+number3;
        while(n > 2){
            number4 = number1+number2+number3;
            number1 = number2;
            number2=number3;
            number3 = number4;
            n--;
        }
        return number4;
    }

    public static void main(String[] args) {
        System.out.println(new N_th_Tribonacci_Number().tribonacci(10));
    }
}
