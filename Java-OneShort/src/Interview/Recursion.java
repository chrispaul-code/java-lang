package Interview;

import java.util.Scanner;



public class Recursion {

    public static int fib(int n){
        if (n<=1){
            return 1;
        }else{
            return  n*fib(n-1);
        }

    };


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Num :");

        int n = sc.nextInt();

        int ans = fib(n);

        System.out.println(ans);



    }
}
