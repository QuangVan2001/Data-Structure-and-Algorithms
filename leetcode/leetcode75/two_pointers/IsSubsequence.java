package leetcode.leetcode75.two_pointers;

public class IsSubsequence {
    public boolean isSubSequence(String string1, String string2) {
        // initialize pointers for both strings
        int i = 0;
        int j = 0;
        while (i < string1.length() && j < string2.length()) {
            // Compare characters, increment both pointers if same
            if (string1.charAt(i) == string2.charAt(j)) {
                i++;
                j++;
            } else {
                j++; // Only incremened second pointer
            }
        }
        // If it is a subsequence , 'i' will have stravelled full length of string 'string1 '
        // so just check and return
        return (i == string1.length());
    }




    public static void main(String[] args) {
        System.out.println(new IsSubsequence().isSubSequence("abc", "ahbgdc"));
      //  System.out.println(new IsSubsequence().isSubSequence("axc", "ahbgdc"));

    }
}
