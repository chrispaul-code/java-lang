

import java.util.*;

public class mulTable {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which you want the table: ");
        int n = sc.nextInt();

        for(int i=1; i<=10 ; i++){
            int mul = i*n;
            System.out.println(n + "x" +i +" = " + mul);
        }


    }
    
}
