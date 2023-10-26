package theBrownBox;

import java.util.Arrays;

public class BubbleSort {
    public static  void bubbleSort(int[] a){
        int n = a.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i-1; j++ ){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                }
            }
        }
    }

    public static void bub(int[] nums){
        int n = nums.length;
        for(int i = 0; i< n ; i++){
            for(int j = 0; j < n-i-1;j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {


        int[] a = {6,3,7,2,10,4,9};
        bub(a);
        for (int num : a){
            System.out.print(num + " ");
        }

    }

}
