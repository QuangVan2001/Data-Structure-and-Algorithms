package theBrownBox;

public class BinarySearch {
    public static int solution(int[] nums, int target){
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
    public static int recursionSolution(int[] nums, int target) {
        return binarySearchRecursive(nums, target, 0, nums.length - 1);
    }

    private static int binarySearchRecursive(int[] nums, int target, int left, int right) {
        if (left > right) {
            return -1; // Trường hợp cơ sở: không tìm thấy target
        }

        int mid = left + (right - left) / 2; // Tránh tràn số khi left và right lớn

        if (nums[mid] == target) {
            return mid; // Tìm thấy target
        } else if (nums[mid] > target) {
            return binarySearchRecursive(nums, target, left, mid - 1); // Tìm kiếm nửa trái
        } else {
            return binarySearchRecursive(nums, target, mid + 1, right); // Tìm kiếm nửa phải
        }
    }






    public static void main(String[] args) {
        BinarySearch search = new BinarySearch();
        int[] nums = {1,2,3,7,9,12,23,35,36,38,39,60};
        int target = 1;
        System.out.println(solution(nums, target));
       // System.out.println(recursionSolution(nums, target));
    }
}
