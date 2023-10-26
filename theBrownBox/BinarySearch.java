package theBrownBox;

public class BinarySearch {
    public int solution(int[] nums, int target){
        int left = 0;
        int right = nums.length -1;
        while (left <= right){
            int mid = (left+right)/2;
            if(nums[mid] > target){
                right = mid-1;
            } else if(nums[mid] < target) {
                left= mid+1;
            } else{
                return mid;
            }
        }
        return -1;
    }





    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        int[] nums = {1,2,3,7,9,12};
        int target = 9;
        System.out.println(search.solution(nums, target));
    }
}
