package leetcode.leetcode75.array_string;

import java.awt.desktop.PreferencesEvent;

public class MaxSubArray {
    //Thuat toan Kandane
    //input: [-2,-5,6,-2,-3,1,5,-6];
    //output: 7
    //Best solution :  O(n)
    public static int maxSubArray(int[] nums){
        //to find the maximum sum possible
        int max_so_far = nums[0];

        //to store the maximum found at a position
        int current_max = nums[0];
        for(int i = 1; i< nums.length; i++){
            //Equivalent to step 3
            current_max = Math.max(nums[i], nums[i] +current_max );

            //Equivalentt to step 4;
            max_so_far = Math.max(current_max, max_so_far);
        }
        return max_so_far;
    }

    //Cui bap solution; O(N^2)
    public static int badSolution(int[] nums){
        int maxSum = 0;
        for(int i = 0; i< nums.length; i++){
            int currentSum = 0;
            for(int j = i; j < nums.length; j++){
                currentSum = currentSum + nums[j];
                maxSum = Math.max(currentSum, maxSum);
            }
        }
        return maxSum;
    }





    public static void main(String[] args){
        int[] nums= {-2,-5,6,-2,-3,1,5,-6};
       // System.out.println(maxSubArray(nums));
        System.out.println(badSolution(nums));
    }

}
