import java.util.*;

public class secLsecS {
     
    public static void main(String args[]){

        int arr[]={2,4,6,8,7};
        int n=5;

        int largest=arr[0];
        int slargest=-1;

        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest && arr[i]>slargest){
                slargest=arr[i];

            }
            
        }
        System.out.println(largest);
        System.out.println(slargest);


        int smallest =arr[0];
        int ssmallest =/*Integer.MAX_VALUE*/ 100;
        for(int i=1; i<n;i++){
            if(arr[i]<smallest){
                ssmallest=smallest;
                smallest=arr[i+1];
            }else if (arr[i]!=smallest && arr[i]<ssmallest){
                ssmallest=arr[i];
            }
            
        }
        System.out.println(ssmallest);
        System.out.println(smallest);

        for(int i=1;i<n;i++){
            if(arr[i]>=arr[i-1]){

            }
            else{
                System.out.println(false);
            }
            System.out.println(true);
             
        }
        



     
    }
}
