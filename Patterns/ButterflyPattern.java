package Patterns;

public class ButterflyPattern {

    public static void main(String arg[]){

        int n =8;

        for(int i=1; i<=n-4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=(n-2*i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i=n-4; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=(n-2*i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        

         
    

    
}

    
}
