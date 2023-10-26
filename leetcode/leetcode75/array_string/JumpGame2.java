package leetcode.leetcode75.array_string;

public class JumpGame2 {
    public int solution(int[] nums){
        int totalJumps = 0;
        int destination = nums.length-1;
        int coverage = 0, lastJumpIndex = 0;
        if(nums.length ==1) return 0;

        for(int i = 0; i< nums.length; i++){
            coverage = Math.max(coverage, i+ nums[i]);
            if(i == lastJumpIndex){
                lastJumpIndex = coverage;
                totalJumps++;

                if(coverage >= destination){
                    return totalJumps;
                }
            }
        }

        return totalJumps;
    }






    public static void main(String[] args) {
        System.out.println(new JumpGame2().solution(new int[]{2,4,1,2,3,1,1,2}));


    }
}
