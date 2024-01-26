package theBrownBox;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

    static void quicksort(int[] a, int left, int right) {
        if (left >= right) {
            return;
        }
        //b1: chon khoa
        int key = a[(left + right) / 2];
        //b2: phan bo lai mang theo khoa

        int k = partition(a, left, right, key);
        System.out.println("Left= " + left + " Right= " + right + " key= " + key + " k= " + k);
        System.out.println(Arrays.toString(Arrays.copyOfRange(a,left, right+1)));


        //b3: chia doi mang => lap lai

        quicksort(a, left, k - 1);
        quicksort(a, k, right);
    }

    // return pivot value
    static int partition(int[] a, int left, int right, int key) {
        int iLeft = left;
        int iRight = right;
        while (iLeft <= iRight) {
            // Voi iLeft, di tim phan tu >= key để đổi chỗ
            while (a[iLeft] < key) {
                iLeft++;
            }
            // Voi iRigt, di tim phan tu <= key để đổi chỗ
            while (a[iRight] > key) {
                iRight--;
            }
            //doi cho 2 phan tu dang dung khong dung vi tri
            if (iLeft <= iRight) {
                int temp = a[iLeft];
                a[iLeft] = a[iRight];
                a[iRight] = temp;
                iLeft++;
                iRight--;
            }
        }
        return iLeft;
    }



//    public static void main(String[] args) {
//        int[] a = {1,5,3,2,8,7,6,4};
//        quicksorts(a, 0, a.length - 1);
//        System.out.println(Arrays.toString(a));
//
//    }

    public static void main(String[] args){
        int[] nums = {6,7,8,5,4,1,2,3};
        QuickSort.sortArray(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] sortArray(int[] nums){
        return sapxepnhanh(nums, 0, nums.length-1);
    }

    public static int[] sapxepnhanh(int[] nums, int left, int right){
        if( left > right) return  new int[0];
        if(left == right){
            int[] singleElement = {nums[left]};
            return singleElement;
        }
        int pivot = nums[(left+right)/2];
        //partition
        int k = chiaNho(nums, left, right, pivot);
        // recursion
        sapxepnhanh(nums, left, k-1);
        sapxepnhanh(nums, k, right);

        return nums;

    }

    public static int chiaNho(int[] nums, int left, int right, int pivot){
        int iL = left;
        int iR = right;
        while (iL <= iR){
            while (nums[iL] < pivot){
                iL++;

            }
            while (nums[iR] > pivot){
                iR--;
            }
            while (iL <=iR){
                int temp =  nums[iL];
                nums[iL] = nums[iR];
                nums[iR] = temp;
                iL++;
                iR--;
            }
        }
        return iL;
    }
   public static void quicksorts(int[] nums, int left, int right){
        if(left >= right ) return;

        int key = nums[(left+right) /2];

        // phan bo lai mang theo khoa
       int k = part(nums, left, right, key);
       quicksorts(nums, left, k-1);
       quicksorts(nums, k, right);
   }

   public static int part(int[] nums, int left, int right, int key){
        int iL = left;
        int iR = right;

        while(iL <= iR){
            while(nums[iL] < key){
                iL++;
            }
            while(nums[iR] >  key) {
                iR--;
            }
            if(iL <=iR){
                int temp = nums[iL];
                nums[iL] = nums[iR];
                nums[iR] = temp;
                iL++;
                iR--;
            }
        }
        return iL;
   }



}
