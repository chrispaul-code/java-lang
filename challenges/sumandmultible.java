
import java.util.*;

public class sumandmultible {

    static void multiplytable(int num){

        int sum=0;
        for (int i = 1; i <= 10; i++){

            int results=num*i;
        
            System.out.print(results+",");
    
            sum=sum+results;

        }
        System.out.println();

        System.out.println(sum);
        
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input:");
        int num=sc.nextInt();
        multiplytable(num);

    }
    
}
