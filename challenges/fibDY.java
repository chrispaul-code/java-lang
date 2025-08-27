

import java.util.Scanner;

public class fibDY {
    public static int nthFib(int n){

        // if (n==0 || n ==1) {
    //         return n;
    //     }

    //     return fib(n-1)+ fib(n-2);9
    

    // }

    // public static void main(String[] args) {

    //     int n = 9;
    //     System.out.println(fib(n));
    // }


            if(n == 0 || n == 1){
            return n;
        }

        int a = 0, b = 1;
        int c = 0;
        for(int i = 2; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the index to find number of fibonacci series: ");
        int n = sc.nextInt();

        System.out.println("Output: "+ nthFib(n));
    }
}
