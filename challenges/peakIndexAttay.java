

public class peakIndexAttay {
    public static void main(String[] args) {
        int arr[]= {1,3,5,7,2};
        
        // int i=0;
        // while(arr[i]< arr[i+1]) {
        //     i++;
        // }
        // System.out.println(i); 



        // for( int i=0; i< arr.length ; i++){
        //     if(arr[i]>arr[i+1]){
        //         System.out.println(i);
        //     }
        // }

        int max=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                
            }

        }
        System.out.println("maximum value of index = "+ max);

        

    }
    
}
