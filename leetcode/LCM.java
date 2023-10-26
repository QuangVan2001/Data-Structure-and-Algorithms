package leetcode;

public class LCM {
    /*
    BCNN(a, b) = (a + b) / UCLN(a,b)
    * */

    public int GCD(int a, int b){
        while(b  > 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return  a;
    }

    public int solution(int a, int b){
        return (a * b) / GCD(a,b) ;
    }

    public static void main(String[] args) {
        LCM lcm = new LCM();
        System.out.println(lcm.solution(16, 64));
    }
}
