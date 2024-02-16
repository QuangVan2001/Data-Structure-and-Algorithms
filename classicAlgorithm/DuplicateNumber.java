package classicAlgorithm;


import java.io.IOException;
import java.util.*;


public class DuplicateNumber {

    public static int[] nums= {1,3,4,2,2};
    //input: [1,2,4,5,2]
    //output: 2
    //15ms
    public int findDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.add(num)){
                return num;
            }
        }
        return nums.length;
    }
    // 20ms
    public int findDuplicate2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        return Arrays.stream(nums)
                .filter(num -> !set.add(num))
                .findFirst()
                .orElse(nums.length); // Sử dụng nums.length hoặc giá trị khác làm giá trị mặc định
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
       // return set.stream().mapToInt(i -> i).toArray();
        return set.stream().mapToInt(i -> i).toArray();
    }



    public int[] printElementDoNotDuplicate2(int[] nums) {
        List<Integer> numsList = Arrays.stream(nums).boxed().toList();

        List<Integer> notDuplicated =  numsList.stream()
                .filter(n -> Collections.frequency(numsList, n)==1).toList();

        return notDuplicated.stream().mapToInt(Integer::intValue).toArray();
    }






    //input: [1,2,4,5,2]
    //output: 2
    // 4ms
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
    public int solution22(int[] nums){
       int slow = 0;
       int fast = 0;
       do{
           slow = nums[slow];
           fast = nums[nums[fast]];
       }while (slow != fast);
       slow = 0;
       while (slow != fast){
           slow= nums[slow];
           fast = nums[fast];
       }
       return slow;
    }







    public static void main(String[] args) throws IOException {
        System.out.println(new DuplicateNumber().findDuplicate(new int[]{1,3,4,2,2}));
        System.out.println();
        System.out.println(new DuplicateNumber().solution2(new int[]{1,3,4,2,2}));
        System.out.println();

        int[] result = new  DuplicateNumber().printElementDoNotDuplicate(nums);
        System.out.println(Arrays.toString(result));
        int[] result1 = new  DuplicateNumber().printElementDoNotDuplicate2(nums);
        System.out.println(Arrays.toString(result1));
        System.out.println();





    }
}
