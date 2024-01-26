package leetcode.leetcode75.array_string;

import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters {
//    Example 1:
//    Input: s = "abcabcbb"
//    Output: 3
//    Explanation: The answer is "abc", with the length of 3.

//    Example 2:
//    Input: s = "bbbbb"
//    Output: 1
//    Explanation: The answer is "b", with the length of 1.

//    Example 3:
//    Input: s = "pwwkew"
//    Output: 3
//    Explanation: The answer is "wke", with the length of 3.
//    Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
    public static int lengthOfLongestSubstring(String s) {
        if(s == null || s.length()==0) return 0;
        int i = 0, j = 0, max =0;
        Set<Character> set = new HashSet<>();
        while (i < s.length()){
            char c = s.charAt(i);
            while(set.contains(c)){
                set.remove(s.charAt(j));
                ++j;
            }
            set.add(c);
            max = Math.max(max, i-j+1);
            ++i;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
