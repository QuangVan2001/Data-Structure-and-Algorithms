package top5Algorithm.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    //test case 1:
    //input: "abcabcbb"
    //output: 3
    //test case 2:
    //input: "bbbb"
    //output: 1
    public static int lengthOfLongestSubstring(String s){
        int n = s.length();
        int maxLength = 0;
        int left= 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int right = 0; right < n; right++){
            char currentChar = s.charAt(right);

            if(map.containsKey(currentChar)){
                left = Math.max(map.get(currentChar) + 1, left);
            }

            maxLength = Math.max(maxLength, right -left +1);
            map.put(currentChar, right);

        }

        return  maxLength;
    }

    public static int solution2(String s){
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

        System.out.println(lengthOfLongestSubstring( "abcabcbb"));
        System.out.println();
        System.out.println(solution2("bbbb"));
    }
}

