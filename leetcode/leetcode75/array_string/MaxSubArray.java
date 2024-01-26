package leetcode.leetcode75.array_string;

public class MaxSubArray {
    //Thuat toan Kandane
    //input: [-2,-5,6,-2,-3,1,5,-6];
    //output: 7
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


    public static int test(int[] nums){
        int max_sub_array= nums[0];
        int current_max = nums[0];
        for(int i = 1; i< nums.length; i++){
            current_max = Math.max(nums[i], nums[i] +current_max);
            max_sub_array = Math.max(current_max, max_sub_array );

        }
        return max_sub_array;
    }

    public static void main(String[] args){
        int[] nums= {-2,-5,6,-2,-3,1,5,-6};
        System.out.println(maxSubArray(nums));
    }

}
