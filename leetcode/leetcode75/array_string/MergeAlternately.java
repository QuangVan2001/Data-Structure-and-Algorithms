package leetcode.leetcode75.array_string;

public class MergeAlternately {
    public String mergeAlternately(String string1, String string2){
        StringBuilder sb = new StringBuilder();
        int length1 = string1.length();
        int length2 = string2.length();
        int i = 0;
        while(i < length1 || i < length2){
            if(i <length1){
                sb.append(string1.charAt(i));
            }
            if(i < length2){
                sb.append(string2.charAt(i));
            }
            i++;
        }
        return sb.toString();

    }


    public static void main(String[] args) {
        System.out.println(new MergeAlternately().mergeAlternately("abc", "pqr"));
    }
}
