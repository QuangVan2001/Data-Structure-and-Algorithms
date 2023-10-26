package leetcode.leetcode75.array_string;

public class ReverseWordsInAStringIII {
    public String reverse(String string){
        String[] words = string.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            StringBuilder stringBuilder = new StringBuilder(word);
            stringBuilder.reverse();
            sb.append(stringBuilder);
            sb.append(" ");
        }

        return sb.toString().trim();
    }


    public static void main(String[] args) {
        System.out.println(new ReverseWordsInAStringIII().reverse("Let's take LeetCode contest"));
    }
}
