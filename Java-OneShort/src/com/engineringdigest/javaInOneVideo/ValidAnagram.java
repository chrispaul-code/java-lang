package com.engineringdigest.javaInOneVideo;

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t ){

        int sl=s.length();
        int tl=t.length();
        HashMap<Character,Integer> map = new HashMap<>();

        if(sl!=tl){
            return false;
        }

        for (int i=0; i<sl; i++){
            Character sc=s.charAt(i);
            Character st=t.charAt(i);

            map.put(sc,map.getOrDefault(sc,0)+1);
            map.put(st,map.getOrDefault(st,0)-1);
        }

        for(int i:map.values()){
            if(i!=0){
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        ValidAnagram obj = new ValidAnagram();

        // Give values to s and t here
        String s = "cat";
        String t = "rat";

        boolean result = obj.isAnagram(s, t);
        System.out.println("Are they anagrams? " + result);
    }


}


