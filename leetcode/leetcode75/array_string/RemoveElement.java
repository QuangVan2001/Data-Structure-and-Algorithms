package leetcode.leetcode75.array_string;

public class RemoveElement {
    public int solution(int[] nums, int val){
        if(nums.length == 0 ) return 0;
        int valid_size = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[valid_size] = nums[i];
                valid_size++;
            }
        }
        return valid_size;

    }




    public static void main(String[] args) {
        System.out.println(new RemoveElement().solution(new int[]{3,2,2,3}, 3));

    }
}
