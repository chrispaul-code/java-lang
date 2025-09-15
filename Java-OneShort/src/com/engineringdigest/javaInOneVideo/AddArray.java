package com.engineringdigest.javaInOneVideo;
import java.util.*;

public class AddArray {

    public static void main(String[] args) {
        int[] num={2,7,4};
        int k =181;
        int count=0;
        int pow=0;
        ArrayList<Integer> numb = new ArrayList<>();

        for (int i = num.length - 1; i >= 0; i--) {
            count += num[i] * (int)Math.pow(10, pow);
            pow++;
        }

        int result=count+k;

        while(result>0){
            numb.add(result%10);
            result=result/10;
        }
        Collections.reverse(numb);
        System.out.println(numb);

    }
}
