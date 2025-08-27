

package Patterns;

public class SquarPattern {
    public static void main(String arg[]){
        // Scanner sc = new Scanner(System.in);
        int n = 4;
        int m = 5;

        //outer loop
        // for (int i=1; i<=n; i++){
        //     //inner loop
        //     for (int j=1;j<=5;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
           
        //outer loop
        for(int i=1; i<=n; i++) {
            //inner loop
            for(int j=1; j<=m; j++){
                //cell -> (i,j)
                if(i == 1 || j == 1 || i == n || j== m){
                    System.out.print("*");
                }else {
                    System.out.print  (" ");
                }
            }
            System.out.println();
        }
         

    }
}
