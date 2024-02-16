package leetcode.leetcode75.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
//    Given an integer array nums of unique elements, return all possible
//    subsets(the power set).
//    The solution set must not contain duplicate subsets. Return the solution in any order.

//    Example 1:
//    Input: nums = [1,2,3]
//    Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

//    Example 2:
//    Input: nums = [0]
//    Output: [[],[0]]

    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> resultList = new ArrayList<>();

        //Start backtracking from the beginning
        backTrack(resultList, new ArrayList<>(), nums, 0);
        return resultList;
    }
    public static void backTrack(List<List<Integer>> resultSets,
                          List<Integer> tempSet,
                          int[] nums, int start){
        //Add the set to result set
        resultSets.add(new ArrayList<>(tempSet));
        for (int i = start; i< nums.length; i++){
            //Case of including the number
            tempSet.add(nums[i] );

            //Backtrack the new subset
            backTrack(resultSets, tempSet, nums, i+1);
            //Casee of not- including the number
            tempSet.remove(tempSet.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));
    }
}
