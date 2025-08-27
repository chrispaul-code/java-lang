
import java.util.*;

public class toLowerCase {
    public static void main(String[] args) {
        // String name = "CHRISTEEN";
        // System.out.println(name.toLowerCase());
        Scanner sc = new Scanner(System.in);
       
        String s = sc.nextLine();

        char [] c = s.toCharArray();

        for(int i=0; i< c.length; i++){
            if(c[i] >= 65 && c[i] <=90) {
                c[i] = (char) (c[i] + 32);
            }
            
        }
        System.out.println(c);
    
    
    }
    
}
