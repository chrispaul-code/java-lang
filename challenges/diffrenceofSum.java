

import java.util.Scanner;

public class diffrenceofSum {

    public static int diffrenceOfSum(int n, int m){
        int sumcount = 0;
        int sumcount2 = 0;
        for (int i = 1; i <= m ; i++) {
            if (i%n==0) {
                sumcount=sumcount+i; 
            }
            if (i%n!=0) {
                sumcount2=sumcount2+i;  
            }
        }

        int total = sumcount2-sumcount;

        return total;


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(diffrenceOfSum(n, m));
    }
    
}
