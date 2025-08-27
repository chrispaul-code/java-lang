import java.time.Month;
import java.util.Scanner;

public class seasons{

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
    System.out.print("Enter month: ");
    int month = scanner.nextInt();

    if ( month >= 3 && month<=5) {
        System.out.println("Season: Sprint Season");
    }else if ( month >= 6 && month<=8) {
        System.out.println("Season: Summer Season");
    }else     if ( month >= 9 && month<=11) {
        System.out.println("Season: Autumn Season");
    }else if( month==12 || month==1 || month==2 ){
        System.out.println("Season: Winter Season");
    }else{
        System.out.println("Invalid Month Entered");
    }

}


}