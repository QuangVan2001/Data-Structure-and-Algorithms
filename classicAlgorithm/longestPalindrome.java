package classicAlgorithm;

import java.util.HashSet;

public class longestPalindrome {
    public static int solution(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        HashSet<Character> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                set.remove(c);
                count += 2;
            } else {
                set.add(c);
            }
        }

        if (!set.isEmpty()) {
            count += 1;
        }

        return count;
    }

    //wrapper class
    //auto boxing
    //boxing

    public static void main(String[] args) {
        System.out.println(solution("abccccdd"));
    }
}
