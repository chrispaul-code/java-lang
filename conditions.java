import java.util.*;

public class conditions {

    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // if(a==b){
        //     System.out.println(a +"is equal to"+ b);
        // } else if(a>b) {
        //     System.out.println(a +"is greater than" +b);
        // }else {
        //     System.out.println(b + " is greater than "+a);
        // }


        Scanner sc = new Scanner(System.in);
            int button = sc.nextInt();

            // if(button==1){
            //     System.out.println("Hello0");
            // } else if(button==2){
            //     System.out.println("Namaste");
            // }else if(button==3){
            //     System.out.println("Bonjour");
            // }else{
            //     System.out.println("Invalid");
            // }


         switch(button){
            case 1 : System.out.println("hello");
            break;
            case 4 : System.out.println("Namste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid Button");
         }

    }
    
}
