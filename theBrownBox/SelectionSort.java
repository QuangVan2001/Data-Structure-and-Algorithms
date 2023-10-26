package theBrownBox;

public class SelectionSort {
    public static void solution(int[] nums){
        for(int i = 0; i < nums.length; i++){
            int minIndex = i;
            for(int j = i+1; j < nums.length; j++){
                // Tim min[i, nums.length]
                if(nums[j] < nums[minIndex]){
                    minIndex = j;

                }
            }
            if( minIndex != i){
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;

            }
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
