package com.engineringdigest.javaInOneVideo;

import java.util.ArrayList;

public class SubArray {
    public static void main(String[] args) {
        int[] arr={100,200,300,400};


        int k =2;

        int i =0;
        int j=0;
        int sum=0;
        int max=0;

        while(j<=arr.length-1){



            sum=sum+arr[j];

            if(j-i+1<k){
                j++;
            } else if (j-i+1==k) {
               max=Math.max(max,sum);

               sum=sum-arr[i];
                j++;
                i++;
            }
        }

        System.out.println(max);

    }
}
