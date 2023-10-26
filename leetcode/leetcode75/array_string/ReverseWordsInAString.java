package leetcode.leetcode75.array_string;

public class ReverseWordsInAString {
    public String solution(String s){
        String[] words = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length - 1; i >=0; i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }




    public static void main(String[] args) {
        System.out.println(new ReverseWordsInAString().solution("the   sky is blue"));
    }
}
