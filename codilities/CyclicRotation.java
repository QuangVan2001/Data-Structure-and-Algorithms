package codilities;

public class CyclicRotation {



    public int[] solution(int[] A, int K) {
        // Implement your solution here
        if(A.length == 0 || A.length ==K){
            return A;
        }
        for(int i =0; i < K; i++){
            int lastValue = A[A.length - 1];
            for(int j = A.length-2; j>=0; j--){
                A[j+1] =A[j];
            }
            A[0] = lastValue;
        }


        return A;
    }

    public int[] rotate(int[] nums, int k) {
        if(nums.length == 0 || nums.length ==k){
            return nums;
        }
        k = k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
        return nums;

    }

    public void reverse(int[] nums, int left, int right){
        while(left < right ){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }



    public static void main(String[] args) {
        int[] inputArray = {3, 8, 9, 7, 6};
        //9,8,3, 6,7
        //

        int rotateCount = 3;
        CyclicRotation cyclicRotation = new CyclicRotation();

        System.out.println("Original array:");
        printArray(inputArray);

        int[] rotatedArray = cyclicRotation.rotate(inputArray, rotateCount);

        System.out.println("\nArray after  rotation:");
        printArray(rotatedArray);


    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
