package leetcode.leetcode75.array_string;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    // O(n^2)
    public List<Boolean> solution1(int[] candies, int extraCandies){
//        Input: candies = [4,2,1,1,2], extraCandies = 1
//        Output: [true,false,false,false,false]
        List<Boolean> ans = new ArrayList<>();
        for(int i = 0; i < candies.length; i++){
            boolean test = false;
            for(int j = 0;  j < candies.length; j++){
                if(candies[i] + extraCandies < candies[j]) {
                    test = true;
                    break;
                }
            }
            if(test){
                ans.add(false);
            } else {
                ans.add(true);
            }

        }
        return ans;
    }


    //O(n)
    public List<Boolean> solution2(int[] candies, int extraCandies){
        List<Boolean> ans = new ArrayList<>(candies.length);
        int max = 0;
        for(int i = 0; i < candies.length; i++){
            max = Math.max(max, candies[i]);

        }
        for(int i : candies){
            ans.add(i >= max - extraCandies);
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        List<Boolean> results = new KidsWithTheGreatestNumberOfCandies().solution2(candies, extraCandies);
        for(boolean result : results){
            System.out.print(result + " ");
        }
    }
}
