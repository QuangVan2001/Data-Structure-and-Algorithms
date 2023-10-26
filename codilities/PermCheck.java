package codilities;

import java.util.HashSet;

public class PermCheck {


    public int solution(int[] A){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 1; i <= A.length; i++){
            set.add(i);
        }

        for(int a : A){
            if(set.contains(a)){
                set.remove(a);
            } else {
                return  0;
            }
        }
        return set.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        PermCheck permCheck = new PermCheck();
        System.out.println(permCheck.solution(new int[] {4,3,5,2}));
        System.out.println(permCheck.solution(new int[] {2,4}));
    }


}
