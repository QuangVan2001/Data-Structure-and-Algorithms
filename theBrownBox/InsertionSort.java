package theBrownBox;

public class InsertionSort  {
    public static  void solution(int[] nums){
        for(int i = 0; i < nums.length; i++){
            // chen nums[i] vao day tu 0 -> i-1
            int numsi = nums[i];
            int j  = i-1;

            while( j >= 0 && nums[j] > numsi){
                nums[j+1] = nums[j];
                j--;
            }

            nums[j+1] = numsi;
            printArray(i, nums);
        }
    }

    public static void printArray(int number, int[] nums){
        System.out.printf("%d: ", number);
        for(int i  = 0; i < nums.length; i++){
            System.out.printf("%d ", nums[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums  = {3,5,2,7,8,1,2};
        solution(nums);

    }
}
