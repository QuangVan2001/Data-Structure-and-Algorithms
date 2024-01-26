package theBrownBox;

import java.util.Arrays;

public class MergeSort {

    public static int[] merge(int[] a1, int[] a2){
        int n = a1.length + a2.length;
        int[] result = new int[n];

        int i = 0, i1 =0, i2 = 0;
        while(i < n){
            if(i1 < a1.length && i2 <a2.length){ //a1 va a2 != rong
                if(a1[i1] <= a2[i2]){
                    result[i] = a1[i1];
                    i++;
                    i1++;
                } else{
                    result[i] =a2[i2];
                    i++;
                    i2++;
                }
            } else{// a1 rong hoac a2 rong

                if(i1 <a1.length){//a1 ok
                    result[i] = a1[i1];
                    i++;
                    i1++;
                } else{//a2 ok
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }
            }
        }

        return result;
    }


    // chia chừng nào không chia nổi nữa thì thôi(cho đến khi còn 1 phần từ)
    // Vói mảng chỉ có 1 phần tử thì coi nó là mảng đã được sắp xếp
    // Tron 2 mang đã được săp xép lại với nhau
    public int[] mergeSort(int[] a, int left, int right){

        //truong hop dac biet, dieu kien dung
        if(left > right){
            return new int[0];
        }
        if (left == right){
            int[] singleElement = {a[left]};
            return singleElement;
        }

        //b1: chia ra
        System.out.println("Chia: " + left + " - " + right);
        int k = (left + right)/2;
        int[] a1 = mergeSort(a, left,k);
        int[] a2 = mergeSort( a, k+1, right);


        //b2: tron vao a1 va a2 la ca mang da duoc sap xep
        int[] result = merge(a1, a2);
        return  result;



    }




    public static int[] sapxepTron(int[] nums, int left, int right){
        //truong hop dac biet, dieu kien dung
        if(left > right){
            return new int[0];
        }
        if (left == right){
            int[] singleElement = {nums[left]};
            return singleElement;
        }

        //b1: chia ra
        System.out.println("Chia: " + left + " - " + right);
        int k = (left + right)/2;
        int[] a1 = sapxepTron(nums, left,k);
        int[] a2 = sapxepTron( nums, k+1, right);


        //b2: tron vao a1 va a2 la ca mang da duoc sap xep
        int[] result = tron(a1, a2);
        return  result;
    }


    public static int[] tron(int[] nums1, int[] nums2){
        int length = nums1.length+nums2.length;
        int[] result = new int[length];

        int i = 0, i1= 0, i2=0;
        while(i < length){
            // th1: nums1 va nums2 != rong
            if(i1 < nums1.length && i2 < nums2.length){
                if(nums1[i1] <= nums2[i2]){
                    result[i] = nums1[i1];
                    i1++;
                    i++;
                } else{
                    result[i]= nums2[i2];
                    i++;
                    i2++;
                }
            } else{
                //th2:nums1 or nums2 == rong
                if(i1 < nums1.length){
                    result[i] = nums1[i1];
                    i++;
                    i1++;
                } else {
                    result[i]= nums2[i2];
                    i++;
                    i2++;
                }
            }
        }
        return result;

    }

    public static int[] sapxepMang(int[] nums){
        return sapxepTron(nums,0, nums.length-1);
    }

    public int[] sortArray(int[] nums){
        return  mergeSort(nums, 0, nums.length -1 );
    }



    public static int[] MergeSort(int[] nums, int left, int right){
        if(left > right) return new int[0];
        if(left == right) {
            int[] singleElement = {nums[left]};
            return singleElement;
        }

        int key = (left+right)/2;
        int[] nums1 = MergeSort(nums, left, key);
        int[] nums2 = MergeSort(nums, key+1, right);

        int[] result = merge1(nums1, nums2);

        return result;
    }

    public  static int[] merge1(int[] nums1, int[] nums2){
        int n = nums1.length+ nums2.length;
        int[] result  = new int[n];

        int i =0, i1 =0, i2 = 0;

        while(i < n){
            // nums1 and nums2 not empty
            if(i1< nums1.length && i2 < nums2.length){
                if(nums1[i1] <= nums2[i2]){
                    result[i] = nums1[i1];
                    i++;
                    i1++;
                } else{
                    result[i] = nums2[i2];
                    i++;
                    i2++;
                }
            }
            //nums1 or nums2 is empy
            else{
                if(i1 < nums1.length){
                    result[i] = nums1[i1];
                    i++;
                    i1++;
                } else{
                    result[i] = nums2[i2];
                    i++;
                    i1++;
                }
            }
        }
        return result;
    }

    public static  int[] sortArrays(int[] nums){
        return MergeSort(nums, 0, nums.length-1);
    }


    public static void main(String[] args) {
        MergeSort sort = new MergeSort();
        int[] a = {1,3,5,7,7,9};
        int[] b = {2,4,6,8,16};
        int[] c = {10,30,21, 3,9,15,21};

        System.out.println(Arrays.toString(sort.merge1(a,b)));
       System.out.println(Arrays.toString(sort.sortArrays(c)));
//        System.out.println();
//        System.out.println(Arrays.toString(sapxepMang(c)));
//        System.out.println(Arrays.toString(tron(a,b)));


    }


}
