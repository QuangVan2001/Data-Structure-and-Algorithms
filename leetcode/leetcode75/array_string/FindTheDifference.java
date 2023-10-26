package leetcode.leetcode75.array_string;

public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        int r = 0;

        for( char c : t.toCharArray()){
            r +=c;
        }
        for( char c: s.toCharArray()){
            r -= c;
        }

        return (char) r;



    }
    public static void main(String[] args) {
        System.out.println(new FindTheDifference().findTheDifference("abcd", "abcde"));

    }
}
