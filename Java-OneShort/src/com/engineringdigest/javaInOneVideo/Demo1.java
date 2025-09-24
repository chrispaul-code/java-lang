package com.engineringdigest.javaInOneVideo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList= new ArrayList<>();

        arrayList.add("Chris");
        arrayList.add("Susy");
        arrayList.add("Paul");
        arrayList.add("Susy");
        arrayList.add("Paul");

        System.out.println(arrayList);

        HashSet<String> hashSet=new HashSet<>();

        hashSet.add("hello");
        hashSet.add("chris");
        for(String a:arrayList){
            hashSet.add(a);
        }

        System.out.println(hashSet);

        HashMap<String, String> capitalCities = new HashMap<>();

        // Add key-value pairs
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        // Retrieve a value using its key
        String capitalOfGermany = capitalCities.get("Germany");
        System.out.println("The capital of Germany is: " + capitalOfGermany);

        // Check if a key exists
        boolean hasFrance = capitalCities.containsKey("France");
        System.out.println("Does the map contain France? " + hasFrance);

        // Iterate through the HashMap
        for (String country : capitalCities.keySet()) {
            System.out.println("Country: " + country + ", Capital: " + capitalCities.get(country));

        }
    }
}
