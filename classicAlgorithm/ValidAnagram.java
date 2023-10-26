package classicAlgorithm;

public class ValidAnagram {
    public boolean isAnagram(String s, String t){
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







    public static void main(String[] args){
        System.out.println(new ValidAnagram().isAnagram("anagram", "nagaram"));
        System.out.println(new ValidAnagram().isAnagram("car", "rat"));

    }
}
