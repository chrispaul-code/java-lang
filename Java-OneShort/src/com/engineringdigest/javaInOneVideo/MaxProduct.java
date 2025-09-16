package com.engineringdigest.javaInOneVideo;

public class MaxProduct {
    public static void main(String[] args) {

        int[] nums={3,7};

        int firstMax=0;

        int secondMax=0;

        int p = nums.length-1;

        while(p>=0){
            if(nums[p]>firstMax){
                secondMax=firstMax;
                firstMax=nums[p];
            }else if(nums[p]>secondMax && nums[p]<=firstMax){
                secondMax=nums[p];
            }

            p--;
        }

        int ans = (firstMax-1)*(secondMax-1);

        System.out.println(ans);
    }
}
