

import java.util.*;

public class plindromeNum {

    static int ispalindrome(int n){

        int rev=0;
        for (int i = n; i>0; i/=10)

            rev=(rev*10)+i%10;

            return(n==rev)?1:0;
            
        

    }

    public static void countPal(int min , int max){

        for (int i = min; i <=max ; i++) {

            if(ispalindrome(i)==1){
                System.out.print(i+ " ");
            }
            
        }
    }



    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int max=sc.nextInt();
        int min=sc.nextInt();

        countPal(min, max);
    }
    
}
