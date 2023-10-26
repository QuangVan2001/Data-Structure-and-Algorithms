package leetcode.leetcode75.array_string;

public class IncreasingTripleSubsequence {
    public boolean increasingTriple(int[] nums){
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int num: nums){
            if(num <= first){
                first = num;
            } else if( num <= second){
                second = num;
            } else {
                return  true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(new IncreasingTripleSubsequence().increasingTriple(new int[]{1,2,3,4,5}));
        System.out.println(new IncreasingTripleSubsequence().increasingTriple(new int[]{5,4,3,2,1}));
        System.out.println(new IncreasingTripleSubsequence().increasingTriple(new int[]{2,1,5,0,4,6}));

    }
}
