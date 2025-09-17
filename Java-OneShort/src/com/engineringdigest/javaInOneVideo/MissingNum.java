package com.engineringdigest.javaInOneVideo;

public class MissingNum {
    public static void main(String[] args) {

        int[] nums={9,6,4,2,3,5,7,0,1};

        int p=nums.length;

        int n = nums.length-1;

        int sum=0;
        int NatSum=p*(p+1)/2;

        while(n>=0){
          sum=sum+nums[n];
          n--;
        }

        int ans=NatSum-sum;

        System.out.println(ans);




    }
}
