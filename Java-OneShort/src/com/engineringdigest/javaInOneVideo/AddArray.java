package com.engineringdigest.javaInOneVideo;
import java.util.*;

public class AddArray {

    public static void main(String[] args) {
        int[] num={2,7,4};
        int k =181;

        int p=num.length-1;

        List<Integer> ans = new ArrayList<>(23);

        int carry=0;

        while(p>=0||k>0){


            int numval=0;

            if(p>=0){
                numval=num[p];
            }

            int d=k%10;

            int sum=numval+d+carry;

            int digit=sum%10;

            carry=sum/10;

            ans.add(digit);

            p--;
            k=k/10;

        }

        if(carry>0){
            ans.add(carry);
        }

        Collections.reverse(ans);

        System.out.println(ans);


    }
}
