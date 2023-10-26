package codilities;

import java.util.HashSet;

public class FrogRiverOne {
    public int solution(int X, int[] A){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= X; i++){
            set.add(i);
        }

        for (int i = 0; i < A.length ; i++){
            if(set.remove(A[i])){
                if(set.isEmpty()){
                    return i;
                }
            }
        }
        return -1;
    }


    public int solution2(int X, int[] A){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 1; i < X; i++){
            set.add(i);
        }
        for(int i = 0; i < A.length; i++){
            if(set.remove(A[i])){
                if(set.isEmpty()){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FrogRiverOne frogRiverOne = new FrogRiverOne();
        System.out.println(frogRiverOne.solution(5, new int[]{1,3,1,4,2,3,5,4}));
        System.out.println(frogRiverOne.solution(1, new int[]{1}));

    }
}
