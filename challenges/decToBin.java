

public class decToBin {

    public static int DecToBinary(int num1){

        // int rem=0;
        int num=num1;
        int pow=0;
        int bin =0;
        while (num>0) {
            int rem=num%2;
            bin=bin+(rem * (int)Math.pow(10, pow));
            num=num/2;
            pow++;
             
        }
        return bin;
    }
    public static void main(String[] args) {
        //  int num1=5;
         System.out.println(DecToBinary(10));
        
    }
}
