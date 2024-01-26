package leetcode.leetcode75.array_string;

public class MaximumProductSubarray {
//    Example 1:
//    Input: nums = [2,3,-2,4]
//    Output: 6
//    Explanation: [2,3] has the largest product 6.


//    Example 2:
//    Input: nums = [-2,0,-1]
//    Output: 0
//    Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
    public static int maxProduct(int[] nums) {
        int n = nums.length;
        int leftProduct = 1; //Dùng để tính tích tiền tố (từ trái sang phải)
        int rightProduct =1; //Dùng để tính tích  hậu tố (từ phải sang trái)
        int ans = nums[0]; //Lưu trữ kết quả lớn nhất, được khởi tạo bằng giá trị đầu tiên của mảng.
        for(int i = 0; i< n; i++){
            //if any of leftProduct or rightProducttt become 0 then update it to 1
            leftProduct = leftProduct == 0 ? 1 : leftProduct;
            rightProduct = rightProduct == 0 ? 1 : rightProduct;

            //prefix product
            leftProduct *= nums[i]; //Tích liên tiếp của các phần tử từ đầu mảng đến vị trí i.

            //suffix product
            rightProduct *= nums[n - 1-i]; //Tích liên tiếp của các phần tử từ cuối mảng về phía vị trí i.

//            Trong mỗi lần lặp, cập nhật ans bằng giá trị lớn nhất giữa ans, leftProduct và rightProduct.
//            Điều này đảm bảo ans luôn là tích lớn nhất tìm được cho đến thời điểm hiện tại.
            ans = Math.max(ans, Math.max(leftProduct, rightProduct));
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{2,3,0,-5,6,-1,4}));
//        System.out.println(maxProduct(new int[]{2,3,-2,4}));
//        System.out.println(maxProduct(new int[]{-2,0,-1}));
//        System.out.println(maxProduct(new int[]{-3,4,-5}));

    }
}
