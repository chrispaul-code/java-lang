

public class buysell {

    public static void buysellstock(int price[]){

        int buyp=price[0];
        int maxprof=0;
        for (int i = 0; i < price.length; i++) {
            buyp=Math.min(buyp, price[i]);
            if (buyp<price[i]) {
                int profit=price[i]-buyp;
                maxprof=profit;
                
            }
            
            
        }
        System.out.println(maxprof);

        


    }

    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        buysellstock(price);
        
    }
    
}
