package leetcode.recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
//    Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
//    Example 1:
//    Input: n = 3
//    Output: ["((()))","(()())","(())()","()(())","()()()"]

//    Example 2:
//    Input: n = 1
//    Output: ["()"]
    // 2ms
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result,"",0, 0, n);
        return result;

    }

    public void backtrack(List<String> result , String currentString, int o, int c, int max){
        if(currentString.length() == max *2){
            result.add(currentString);
            return;
        }
        if (o < max) {
            backtrack(result, currentString +"(", o+1, c, max );
        }
        if(c < o){
            backtrack(result, currentString+ ")", o, c+1, max);
        }
    }



}
