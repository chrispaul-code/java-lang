package Arrays;

public class Lnum {
    public static void main(String[] args) {
        int arr[]= {160,100,3,6,5,0,140};

        // int maxx=num[0];
        // for (int i = 0; i < num.length; i++) {
        //     if (num[i]>maxx) {
        //         maxx=num[i];
        //     }
        // }

        // System.out.println(maxx);

        int num=(arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[(num-i)];
            System.out.print(arr[i]+" ");
        
        }
        

        

    }
    
}
