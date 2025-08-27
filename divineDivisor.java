import java.util.*;
public class divineDivisor {
    public static void main(String[] args) {
        int input=36;

        Set<Integer> divisors= new TreeSet<>();
        
        for(int i=1; i<=Math.sqrt(input) ; i++){
           
            if(input%i==0){
                
                
                divisors.add(i);

                divisors.add(input/i);
                
            }

        }
        System.out.println(new ArrayList<>(divisors));  
    }
    
}
