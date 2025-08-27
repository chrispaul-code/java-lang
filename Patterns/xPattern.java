
package Patterns;

public class xPattern {

    public static void main(String arg[]){

        int n=5;
 // Loop for each row
 for (int i = 0; i < n; i++) {
    // Loop for each column
    for (int j = 0; j < n; j++) {
        // Print star for cross pattern
        if (i == j || i + j == n - 1) {
            System.out.print("*");
        } else {
            System.out.print(" ");
        }
    }
    // Move to the next line after each row
    System.out.println();
} }

        

        

         
    

    
}

    
