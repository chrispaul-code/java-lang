import java.util.*;

public class Reararagestrings {
    public static void main (String[] arg){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();

        char [] arr1 =s.toCharArray();
        char [] arr2 =t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    

    }
    
}
