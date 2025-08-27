
public class ratcount {
    public static void main(String[] args) {
        int r=7;
        int unit=2;
        int n=8;
        int arr[]={2,3,3,5,7,4,1,2};
        int output=r*unit;

        int count=0;
        int result=0;
        for (int i = 0; i < arr.length; i++) {
            result=result+arr[i];
            count=count+1;

            if (result>=output) {
                System.out.println(count);
                break;
            }

            
        }
        
    }
    
}
