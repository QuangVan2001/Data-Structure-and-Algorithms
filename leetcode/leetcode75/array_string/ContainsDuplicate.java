package leetcode.leetcode75.array_string;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {


//    Example 1:
//    Input: nums = [1,2,3,1]
//    Output: true

//    Example 2:
//    Input: nums = [1,2,3,4]
//    Output: false

//    Example 3:
//    Input: nums = [1,1,1,3,3,4,3,2,4,2]
//    Output: true
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;

    }


    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
        System.out.println(containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));

    }
}
