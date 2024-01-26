package classicAlgorithm;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t){
        int alpha[] = new int[26];
        for(char ch : s.toCharArray()){
            alpha[ch - 'a']++;
        }
        for(char ch : t.toCharArray()){
            alpha[ch - 'a']--;
        }
        for(int i: alpha){
            if(i != 0){
                return false;
            }
        }
        return true;
    }

    public static boolean test(String s1, String s2){
        int[] alpha = new int[26];
        for( char ch: s1.toCharArray()){
            alpha[ch-'a']++;
        }
        for(char ch: s2.toCharArray()){
            alpha[ch-'a']--;
        }
        for(int i : alpha){
            if(i != 0){
                return false;
            }
        }
        return true;
    }







    public static void main(String[] args){
        System.out.println(test("anagram", "nagaram"));
        System.out.println(test("car", "rat"));

    }
}
