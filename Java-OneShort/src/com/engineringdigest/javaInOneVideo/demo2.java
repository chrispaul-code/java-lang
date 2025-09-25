package com.engineringdigest.javaInOneVideo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class demo2 {
    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "kseeg";

        HashMap<Character,Integer> ans = new HashMap<>();



        for (char ch:s1.toCharArray()) {
            ans.put(ch, ans.getOrDefault(ch, 0) + 1);
        }
        for (char ch:s2.toCharArray()) {
            ans.put(ch, ans.getOrDefault(ch, 0) - 1);
        }

        for (int count : ans.values()) {
            if (count != 0) {
                System.out.println("False");
                break;
            }
        }
        System.out.println("True");




    }
}
