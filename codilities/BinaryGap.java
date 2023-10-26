package codilities;

public class BinaryGap {

    /*public int solution(int N) {
        String binaryString = Integer.toString(N, 2);
        boolean started = false;
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            String charOfBinaryString = binaryString.substring(i, i + 1);
            if (charOfBinaryString.equals("1")) {
                if (started) {
                    if (count > maxCount) {
                        maxCount = count;
                    }
                }
                count = 0;
                started = true;
            }

            if (charOfBinaryString.equals("0")) {
                count++;
            }
        }
        return maxCount;
    }*/
    public int solution(int N){
        String binaryString = Integer.toString(N, 2);
        boolean started = false;

        int count = 0;
        int maxCount= 0;
        for (int i = 0; i< binaryString.length(); i++){
            String c = binaryString.substring(i, i+1);
            if(c.equals("1")){
                if(started){
                    if(count > maxCount){
                        maxCount = count;
                    }
                }
                count = 0;
                started = true;
            }
            if(c.equals("0")){
                count++;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        BinaryGap binaryGap = new BinaryGap();
        System.out.println(binaryGap.solution(1041));

    }
}
