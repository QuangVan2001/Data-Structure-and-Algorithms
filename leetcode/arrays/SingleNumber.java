package leetcode.arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
//    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//
//    You must implement a solution with a linear runtime complexity and use only constant extra space.
//
//
//
//    Example 1:
//
//    Input: nums = [2,2,1]
//    Output: 1
//    Example 2:
//
//    Input: nums = [4,1,2,1,2]
//    Output: 4
//    Example 3:
//
//    Input: nums = [1]
//    Output: 1

    // 1ms
    public static int singleNumber(int[] nums){
        //variable to store the xor result of a
        int sing = nums[0];
        for(int i = 1; i< nums.length; i++){
            //xor the element with the previous
            sing = sing ^ nums[i];
        }

        return sing;
    }
    public static int test(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) +1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if (entry.getValue() ==1){
                return entry.getValue();
            }
        }
        return -1;
    }

    //14ms
    public static  int singleNumber2(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
    }
}
