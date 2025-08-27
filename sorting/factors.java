import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the positive integer:");
        int n=sc.nextInt();

        n=Math.abs(n);

        if (n==0) {
            System.out.println("No factor");
        }

        for (int i = 1; i <= n; i++) {
            if (n%i==0) {
                System.out.print(i +" ");
            }
        }


    }
}
