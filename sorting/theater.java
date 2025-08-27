import java.util.*;
public class theater {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of Tickets:");
        int noTicket=sc.nextInt();
        System.out.println("Do you want to purchase any refreshments:");
        char refreshment = sc.next().charAt(0);
        System.out.println("Do you have any coupon code:");
        char code=sc.next().charAt(0);
        System.out.println("Enter the circle:");
        char classAorB=sc.next().charAt(0);

        int AorB=0;

        if (classAorB=='B') {
            AorB=75;
        }else{
            AorB=150;
        }

        if (noTicket>=5 && noTicket<=40) {
            double totalCost=noTicket*AorB;
            

            if (noTicket>20) {
                double dis1= (totalCost*(0.9));
                
                if (code=='y') {
                    dis1=(dis1*(0.98));
                    
                }
                if (refreshment=='y') {
                    double ref=noTicket*50;
                    totalCost=dis1+ref;
                    System.out.println(totalCost);
                    
                }
               
            } else {
                System.out.println(totalCost);
            }
          
            
        }else{
            System.out.println("Minimum 5 and a maximum of 40 tickets should be purchased");
        }


    }
    
}
