package codilities;

public class FrogJmp {
//    public  int solution(int X, int Y, int D){
//        int distance = Y- X;
//        int jumps = (int) Math.ceil(distance /(double) D);
//        return jumps;
//
//
//    }

    public static void main(String[] args ){
        FrogJmp frogJmp = new FrogJmp();
        System.out.println(frogJmp.solution(10,85, 30));

    }
    public int solution(int X, int Y, int D){
        int distance = Y- X;
        int jumps = (int) Math.ceil(distance/ (double) D);
        return jumps;
    }
}
