package leetcode.leetcode75.sliding_window;

public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k){

        //Get sum for starting window
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        int maxSum = sum;

        // Start sliding window
        int startIndex = 0;
        int endIndex = k;
        while (endIndex < nums.length){
            sum -= nums[startIndex];  // Remove previous element
            startIndex++;

            sum += nums[endIndex]; // Add next element
            endIndex++;

            maxSum = Math.max(maxSum, sum); // Update max sum
        }

        return (double) maxSum / k;
    }




    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(new MaximumAverageSubarrayI().findMaxAverage(nums, k));


    }
}
