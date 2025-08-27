package Patterns;

public class FloydsTriangle {

    public static void main(String arg[]){

        int n = 5 ;
        int number =1; 
        
        for(int i=1; i<=n;i++){

            for(int j=1; j<=i ; j++){
                System.out.print(number+" ");
                number++;

            }

           System.out.println(); 

        }

        // int n =5;

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         int sum= i+j;
        //         if(sum%2==0){
        //             System.out.print("1 ");
        //         }else{
        //             System.out.print("0 ");
        //         }
                   
        //     }

            // System.out.println();
        }


    

    
}


    
