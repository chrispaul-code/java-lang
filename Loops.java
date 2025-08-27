import java.util.*;

public class Loops {
    public static void main(String arg[]){

        // for loop
        // for(int i = 0; i <11; i++){
        //     System.out.print(i+",");
        // } 
       
        // While loop 

        // int i=0;
        // while(i<11){
        //     System.out.println(i);
        //     i++;
        // }

        // do while loop
        // int  i =0;
        // do {
        //     System.out.println(i);
        //     i=i+1;
        // }while(i<11);

        // calculating the sum of n natural numbers
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        
        // int sum = 0;
        // for(int i=0; i<=n; i++){
        //     sum=sum+i;
            
        // }
        // System.out.println(sum);

    //  calculating the value of any tabel user tells

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1;i<11;i++){
            int ans = n*i;
            System.out.println(ans);
        }

    }
}
 