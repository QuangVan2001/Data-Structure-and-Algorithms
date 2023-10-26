package classicAlgorithm;

import com.sun.source.tree.UsesTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DuplicateNumber {
    //input: [1,2,4,5,2]
    //output: 2
    public int findDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.add(num)){
                return num;
            }
        }
        return nums.length;
    }
    //input: [1,2,4,5,2]
    //output: [1,4,5]
    public int[] printElementDoNotDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            if(!set.add(num)){
                set.remove(num);
            }
        }
        return set.stream().mapToInt(i -> i).toArray();
    }

    //input: [1,2,4,5,2]
    //output: 2
    public int solution2(int[] nums){
        int slow = 0;
        int fast = 0;
        do{
            slow = nums[slow];
            fast= nums[nums[fast]];
        }while(slow != fast);

        slow =0;
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }







    public static void main(String[] args) {
        System.out.println(new DuplicateNumber().findDuplicate(new int[]{1,3,4,2,2}));
        System.out.println();
        System.out.println(new DuplicateNumber().solution2(new int[]{1,3,4,2,2}));
        System.out.println();
        int[] nums= {1,3,4,2,2};
        int[] result = new  DuplicateNumber().printElementDoNotDuplicate(nums);
        System.out.println(Arrays.toString(result));



    }
}
