package classicAlgorithm;

public class ValidPalindrome {
//    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
//    it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//    Given a string s, return true if it is a palindrome, or false otherwise.

//            Example 1:
//    Input: s = "A man, a plan, a canal: Panama"
//    Output: true
//    Explanation: "amanaplanacanalpanama" is a palindrome.


//    Example 2:
//    Input: s = "race a car"
//    Output: false
//    Explanation: "raceacar" is not a palindrome.
    //    Example 3:
//    Input: s = " "
//    Output: true
//    Explanation: s is an empty string "" after removing non-alphanumeric characters.
//    Since an empty string reads the same forward and backward, it is a palindrome.
    public boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;
        while (left < right){
            char iL = s.charAt(left);
            char iR = s.charAt(right);
            if(!Character.isLetterOrDigit(iL)){
                left++;
            } else if(!Character.isLetterOrDigit(iR)){
                right--;
            } else {
                if(Character.toLowerCase(iR) != Character.toLowerCase(iL)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

    public boolean isValid(String s){
        int left = 0;
        int right = s.length() -1;
        while (left < right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }



    public static boolean test(String s){
        int left = 0;
        int right = s.length()-1;
        while (left < right){
            char iLeft = s.charAt(left);
            char iRight = s.charAt(right);
            if(!Character.isLetterOrDigit(iLeft)){
                left++;
            } else if(!Character.isLetterOrDigit(iRight)){
                right--;
            }
            else {
                if(Character.toLowerCase(iLeft) != Character.toLowerCase(iRight)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }






    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
       String s2 = "race a car";
        String s3 = " ";
        String s4  = "racabacar";
  // System.out.println(new PalindromeString().test(s1));
//       System.out.println(new PalindromeString().ValidPalindrome(s2));
//       System.out.println(new PalindromeString().ValidPalindrome(s3));
//        System.out.println(new PalindromeString().ValidPalindrome(s4));
        System.out.println(new ValidPalindrome().isValid(s4));



    }



}
