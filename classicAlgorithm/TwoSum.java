package classicAlgorithm;

import java.awt.desktop.PreferencesEvent;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TwoSum {
    public static int[] solution1(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }


    public int[] solution2( int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i])){
                return  new int[] { map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }








    public static void main(String[] args) {
        int[] nums = { 11,15, 2, 7};
        int target = 9;
        int[] nums1 = { 11,15, 2, 7};
        int target1 = 10;
        int[] results = new TwoSum().solution2(nums, target);

        System.out.println(Arrays.toString(results));

        System.out.println(Arrays.toString(solution1(nums1, target1)));

    }
}
