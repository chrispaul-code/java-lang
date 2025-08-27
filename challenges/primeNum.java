
public class primeNum {

    public static void isprime(int n ){

        int count =0;
        for (int i = 1; i <= Math.sqrt(n); i++) {

            if (n%i ==0) {
                count = count +1;   
            }
        }    

        if (count ==1) {
            System.out.print("its a prime number");
            
        }else{
            System.out.print("its not a prime number");
        }
            
    
    }
    public static void main(String[] args) {
        int n = 5;
        isprime(n);

    }
    
}