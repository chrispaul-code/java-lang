import java.util.*;
public class halfbreak {
    public static void main(String[] args) {

       int npizza, npuffs,ncold; 
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of pizzas purchased:");
       npizza=sc.nextInt();
       System.out.println("The number of puffs purchased:");
       npuffs=sc.nextInt();
       System.out.println("Enter the no of Cold Drinks purchased:");
       ncold=sc.nextInt();

       int total=(npizza*100)+(npuffs*20)+(ncold*10);

       System.out.println("Bill Details:");
       System.out.println("No of Pizzas:"+ npizza);
       System.out.println("The No of Puffs:"+npuffs);
       System.out.println("No of Cold drinks:" + ncold);
       System.out.println("Total price =" + total);
       System.out.println("Enjoy the show!!");
    }
}
