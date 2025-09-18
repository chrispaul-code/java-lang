package com.engineringdigest.javaInOneVideo;

import java.util.ArrayList;
import java.util.List;

public class RemoveElem {
    public static void main(String[] args) {
        int[] nums={3,2,2,3};
        int val=3;

        int ptr=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]!=val){
                nums[ptr]=nums[i];
                ptr++;
            }
        }

        System.out.println(ptr);
    }
}
