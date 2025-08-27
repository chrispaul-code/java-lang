package Patterns;

public class lefttrig {
    public static void main(String[] args) {
        int row=4;
        // for (int r  = 1; r <=4; r++) {
        //     for (int c= 3; c >=r; c--) {
        //         System.out.print(" ");      
        //     }
        //     for (int i = 1; i <=r; i++) {
        //         System.out.print("*");
                
        //     }

        //     System.out.println();

        // }

        for (int r  = 1; r <=4; r++) {
            for (int c= 3; c >=r; c--) {
                System.out.print(" ");      
            }
            for (int i = 1; i <=r; i++) {
                // System.out.print("*");

                System.out.print("* ");

                
                
            }

            System.out.println();

        }
    }
    
}
