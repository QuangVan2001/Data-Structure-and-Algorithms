package leetcode.leetcode75.array_string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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
//thời gian là O(N) và về không gian là O(M)
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




//    Ý Tưởng
//    Sử dụng một HashMap (Map<Character, Integer>) để lưu trữ vị trí gần nhất của mỗi ký tự trong chuỗi.
//    Khi gặp một ký tự lặp lại, có thể ngay lập tức nhảy đến vị trí sau ký tự đó mà không cần duyệt qua từng ký tự một cách tuần tự.
//    Điều này giảm thiểu việc di chuyển con trỏ j qua lại nhiều lần, như trong phương pháp sử dụng Set.
    public static int lengthOfLongestSubstring2(String s) {
        if (s == null || s.length() == 0) return 0;

        Map<Character, Integer> map = new HashMap<>();
        int max = 0;

        for (int j = 0, i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                // Cập nhật j để nhảy đến vị trí sau ký tự lặp lại gần nhất
                j = Math.max(map.get(s.charAt(i)), j);
            }
            max = Math.max(max, i - j + 1);
            // Cập nhật vị trí mới nhất của ký tự hiện tại
            map.put(s.charAt(i), i + 1);
        }
        return max;


    }


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring2("abcabcbb"));
//        System.out.println(lengthOfLongestSubstring("bbbbb"));
//        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
