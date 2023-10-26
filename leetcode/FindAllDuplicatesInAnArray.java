package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllDuplicatesInAnArray {
    public List<Integer> solution1(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i] )-1;
                if (nums[index] < 0) {
                    list.add(index + 1);
                }
                nums[index] = nums[index] * -1;

        }
        return list;
    }

    public List<Integer> solution2(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                result.add(num);
            }
        }

        return result;
    }




    public static void main(String[] args) {
        System.out.println(new FindAllDuplicatesInAnArray().solution1(new int[] {1,2,3,3,2,1,4}));
    }
}
