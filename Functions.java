import java.util.*;

public class Functions {
    // public static void sumOfNum(int a, int b){
    //     int sum = a+b;
    //     System.out.println("sum of a + b ="+sum);
    //     return;

    // }
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     sumOfNum(a,b);

    // }

    // public static int mulOfNum(int a, int b){
    //     return a*b;

    // }
    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();

    //     int mull = mulOfNum(a,b);
    //     System.out.println(mull);

    // }

    public static void FactorialOfNum(int n){

        if(n<0){
            System.out.println("Invalid");
            return;
        }
        
       
       
        int factorial =1;

       for(int i=n; i>=1; i--){
         factorial =factorial * i;
        }
        System.out.println(factorial);
        return;
    

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        

        FactorialOfNum(n);
        

    }
    
}
