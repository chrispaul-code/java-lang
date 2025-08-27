
import java.util.*;

public class passwordcheck {
    public static void main(String[] args) {
        String str="Chris123";
        char c[]=str.toCharArray();
        int count=0;
        int capcount=0;
        int sc=0;
        for (int i = 0; i < c.length; i++) {
            if (48<=(c[i])&&(c[i])<=57) {
                count=count+1;   
            }
            if(65<=(c[i])&&(c[i])<=90){
                capcount=capcount+1;

            }
            if (c[i]=='/'|| c[i]==' ') {
                sc=1;

            }
            
        }
       
        if (count>1&& capcount>=1&&sc!=1) {
            if (c.length>=4&&!(c[0]>='0'&&c[0]<='9')) {
                System.out.println("1");


                
            }else{
                System.out.println("0");
            }
   
        }else{
            System.out.println("0");
        }




    }
    
}
