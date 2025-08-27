

public class zpattern {
    public static void main(String[] args) {
        // for (int r = 1; r<=5; r++) {
        //     for (int c = 1; c<=5; c++) {
        //         if (r==1||r==5||(r+c)==6) {
        //             System.out.print("*");
                    
        //         }else{
        //             System.out.print(" ");
        //         }
               
    
        //     }
        //     System.out.println();
            
        // }

        for (int r = 1; r<=5; r++) {
            for (int c = 1; c<=5; c++) {
                if (r==1||c==1||c==5||r==3) {
                    System.out.print("*");
                    
                }else{
                    System.out.print(" ");
                }
               
    
            }
            System.out.println();
            
        }
    }

    
}
