package leetcode.leetcode75.DP_1D;

public class ClimbingStairs {
    //input: 2
    //output: 2
    //Explanation: There are two ways to climb to the top.
    //1. 1 step + 1 step
    //2. 2 steps
    //Solution: number of way to reach step 7  = number of way to reach step 6 +   number of way to reach step 5

    public static int climStairs(int n){
        if(n == 1) return 1;

        int[] ways = new int[n+1]; // gia su n = 8 thi mang =[0,1,2,3,4,5,6,7,8]
        ways[1] =1;
        ways[2] =2;

        for(int i = 3; i<=n; i++){
            ways[i] = ways[i-1] + ways[i-2];
        }

        return ways[n];
    }

    public static void main(String[] args) {

        System.out.println(climStairs(8));
    }
}
