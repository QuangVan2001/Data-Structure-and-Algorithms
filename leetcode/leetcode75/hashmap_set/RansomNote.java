package leetcode.leetcode75.hashmap_set;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
//    Given two strings ransomNote and magazine,
//    return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
//    Each letter in magazine can only be used once in ransomNote.
//
//

//    Example 1:
//    Input: ransomNote = "a", magazine = "b"
//    Output: false

//    Example 2:
//    Input: ransomNote = "aa", magazine = "ab"
//    Output: false

//    Example 3:
//    Input: ransomNote = "aa", magazine = "aab"
//    Output: true
    public boolean canConstruct(String ransomNote, String magazine){
        int[] alpha = new int[26];

        for(char c: magazine.toCharArray()){
            alpha[c-'a']++;
        }
        for(char c: ransomNote.toCharArray()){
            alpha[c-'a']--;
            if (alpha[c - 'a'] < 0) {
                // Nếu giảm xuống dưới 0, tức là ransomNote có ký tự không có trong magazine
                return false;
            }
        }
        return true;
    }

    public static boolean test(String s1, String s2){
        Map<Character, Integer> map = new  HashMap<>();
        for(char c: s2.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for (char c: s1.toCharArray()){
            if(!map.containsKey(c) || map.get(c) <=0){
                return false;
            }
            map.put(c,map.get(c)-1);
        }
        return true;
    }


    public static boolean solution2(String ransomNote, String magazine){
        Map<Character, Integer> counts = new HashMap<>();
        for(char c: magazine.toCharArray()){
            counts.put(c, counts.getOrDefault(c,0)+1);
        }
        for(char c: ransomNote.toCharArray()){
            if (!counts.containsKey(c) || counts.get(c) <= 0){
                return false;
            }
            counts.put(c, counts.get(c)-1);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution2("a","b"));
        System.out.println(solution2("aa","ab"));
        System.out.println(solution2("aa","aab"));
    }

}
