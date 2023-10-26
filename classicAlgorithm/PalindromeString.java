package classicAlgorithm;

public class PalindromeString {

    public boolean ValidPalindrome(String s){
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






    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
       String s2 = "race a car";
        String s3 = " ";
        String s4  = "racabacar";
//        System.out.println(new PalindromeString().ValidPalindrome(s1));
//       System.out.println(new PalindromeString().ValidPalindrome(s2));
//       System.out.println(new PalindromeString().ValidPalindrome(s3));
//        System.out.println(new PalindromeString().ValidPalindrome(s4));
        System.out.println(new PalindromeString().isValid(s4));



    }



}
