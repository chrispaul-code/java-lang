package Patterns;
import java.util.*;

public class rigtrignum {
    public static void main(String[] args) {
        // for (int i = 1; i <=4; i++) {
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        // for (int i = 4; i >=1; i--) {
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // for (int i = 1; i <=4; i++) {
        //     for (int j = 1; j <=i; j++) {
        //         // System.out.print(String.valueOf((char)(j + 64)));
        //         System.out.print((char)(j + 64)+ " ");
        //     }
        //     System.out.println();
        // }

        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <=i; j++) {
                // System.out.print(String.valueOf((char)(j + 64)));
                System.out.print((char)(i + 64)+ " ");
            }
            System.out.println();
        }
     
    
    }
    
}
