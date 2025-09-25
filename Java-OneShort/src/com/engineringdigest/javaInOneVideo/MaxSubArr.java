package com.engineringdigest.javaInOneVideo;

import java.util.*;
public class MaxSubArr {
    public static void main(String[] args) {
        int[] arr={5, 1, 3, 4, 2};
        int k=1;

        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<=arr.length-k; i++){
            int max=0;
            for(int j=i; j<i+k; j++){

                if(arr[j]>max){
                    max=arr[j];
                }

            }
            ans.add(max);
        }

        System.out.println(ans);


    }
}
