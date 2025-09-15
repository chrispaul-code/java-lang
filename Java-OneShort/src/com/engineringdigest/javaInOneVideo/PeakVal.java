package com.engineringdigest.javaInOneVideo;

public class PeakVal {
    public static void main(String[] args) {
        int[] arr={1,2,3,6,6,6,4,3,1};

        int mid=arr.length/2;

        int start=arr[0];

        int end=arr[arr.length-1];

        if(arr[mid-1]>arr[mid]){
            end=mid-1;
        }

        if(arr[mid+1]>arr[mid]){
            start=mid+1;
        }

        if(arr[mid+1]==arr[mid]||arr[mid-1]==arr[mid]){

        }







    }
}
