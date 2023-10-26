package leetcode.leetcode75.two_pointers;

public class MoveZeroes {
    //
    public void moveZeros1(int[] nums){
       // start with the first position

        int insertPosition = 0;
        for(int i = 0; i < nums.length; i++){
            //fill all non-zero numbers
            if(nums[i] != 0){
                nums[insertPosition] = nums[i];
                insertPosition++;
            }
        }
        while(insertPosition < nums.length){
            nums[insertPosition] = 0;
            insertPosition++;
        }
    }

    // Two Pointers
    public void moveZeros2(int[] nums){
        if(nums.length == 0 || nums.length == 1) return;
        int nonZero = 0;
        int zero = 0;
        while (nonZero < nums.length){
            if(nums[nonZero] != 0){
                int temp = nums[nonZero];
                nums[nonZero] = nums[zero];
                nums[zero] = temp;
                nonZero++;
                zero++;
            } else {
                nonZero++;
            }
        }
    }
    public int[] moveZerosToLeft(int[] nums){
        int insertPosition = nums.length-1;
        for(int i = nums.length -1; i >= 0; i-- ){
            if(nums[i] != 0){
                nums[insertPosition] = nums[i];
                insertPosition--;
            }

        }
        while(insertPosition >= 0){
            nums[insertPosition] = 0;
            insertPosition--;
        }
        return nums;
    }


    public static void main(String[] args){
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] nums = {0,1,0,3,12};

        moveZeroes.moveZeros1(nums);
        for (int num : nums){
            System.out.print(num + " ");
        }
        System.out.println();
        int[]  result= moveZeroes.moveZerosToLeft(nums);
        for (int num : result){
            System.out.print(num + " ");
        }
    }
}
