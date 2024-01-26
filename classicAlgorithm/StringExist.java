package classicAlgorithm;

public class StringExist {

    public static boolean isExist(String[] s, String chuoi){
        if(s.length == 0  || chuoi.isEmpty()) return false;
        for(String s1: s){
            if(s1.equals(chuoi)){
                return true;
            }
        }
        return false;
    }











    public static void main(String[] args) {
        String[] strings = {"abb", "add", "aaa","bfb"};
        String chuoi = "aaa";
        System.out.println(isExist(strings, chuoi));
    }
}
