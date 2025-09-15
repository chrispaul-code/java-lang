package com.engineringdigest.javaInOneVideo;
import java.util.*;
public class LogestSubstring {
    public static void main(String[] args) {
        Set<Character> chart=new HashSet<>();
        List<Integer> result = new ArrayList<>();
        String s="dvdf";
        int count =0;

        for (int i = 0; i < s.length(); i++) {

            for (int j = 1; j < s.length(); j++) {
                chart.add(s.charAt(i));
                count++;
                if(chart.contains(s.charAt(j))){
                    result.add(count);
                    count=0;
                }

            }
        }

        result.add(count);
        int maxNum = Collections.max(result);
        System.out.println(maxNum);

        }

}
