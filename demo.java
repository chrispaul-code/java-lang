// import java.util.*;
public class demo {
    public static void main(String[] args) {


   int n =345335;
   int count=0;
   while (n>0) {
    int rem=n%10;
    count=count*10+rem;

    n=n/10;
  
   }
   System.out.println(count);

 }
}
