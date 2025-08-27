
import java.util.*;

public class oddeven {

    public static void oddeeven(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                System.out.print("Even"); 
            }else{
                System.out.print("Odd");
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
        System.out.println("intput arrat values of index "+ i);
            arr[i]=sc.nextInt();
    }
        oddeeven(arr);
        
    }
    
}
