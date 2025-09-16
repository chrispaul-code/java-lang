package com.engineringdigest.javaInOneVideo;

public class Medianarr {
    public static void main(String[] args) {
        int[] nums1={1,4,7,9};
        int[] nums2={2,3,6,8};

        int n1=nums1.length-1;
        int n2=nums2.length-1;

        int[] ans=new int[nums1.length+nums2.length];

        int p1=0;
        int p2=0;
        int p3=0;

        while(p1<nums1.length || p2<nums2.length){

            int val1=p1<nums1.length ? nums1[p1]: Integer.MAX_VALUE;
            int val2=p2<nums2.length ? nums2[p2]: Integer.MAX_VALUE;

            if(val1<val2){
                ans[p3]=val1;
                p1++;
            }else{
                ans[p3]=val2;
                p2++;
            }
            p3++;
        }

        if(ans.length%2==0){
            double result=(double)(ans[ans.length/2]+ans[ans.length/2 -1])/2;
            System.out.println(result);
        }else {
            double result =(double)(ans[ans.length/2]);
            System.out.println(result);
        }

    }
}
