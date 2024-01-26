package classicAlgorithm;

public class ReverseArray {

        public int[] solution(int[] nums) {
            int left = 0;
            int right = nums.length - 1;
            while (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
            return nums;
        }

    public String[] solution2(String[] strings) {
        int i = 0;
        int j = strings.length - 1;
        while (i < j) {
            String temp = strings[i];
            strings[i] = strings[j];
            strings[j] = temp;
            i++;
            j--;
        }
        return strings;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        String[] string = {"anh", "pham", "quang", "van"};
        ReverseArray reverseArray = new ReverseArray();
        int[] result = reverseArray.solution(nums);
        for (int a : nums) {
            System.out.print(a + " ");
        }
        System.out.println();
        String[] reveseString = reverseArray.solution2(string);
        for (String s : string) {
            System.out.print(s + " ");
        }

    }
}
