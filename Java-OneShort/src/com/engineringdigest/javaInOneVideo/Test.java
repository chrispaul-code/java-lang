package com.engineringdigest.javaInOneVideo;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Chris");
        names.add("susy");
        names.add("susy");
        names.add("susy");
        names.add("Paul");

        names.remove("susy");

        //do not adds Duplicates

        System.out.println(names);
        System.out.println(names.contains("Paul"));
        System.out.println(names.isEmpty());

        for(String name:names){
            System.out.println(name);
        }

        List<Integer> numberList= new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(1);
        System.out.println(numberList);

        Set<Integer> numberSet= new HashSet<>();

        numberSet.addAll(numberList);

        System.out.println(numberSet);


        HashMap<String,Integer> empIds= new HashMap<>();

        empIds.put("Chris",12);
        empIds.put("Paul",56);
        empIds.put("John",63);

        System.out.println(empIds);

    }
}
