package com.java8.features.streams;

import java.util.ArrayList;

public class StreamsVsCollectionsDemo {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(); 
        names.add("Adam");
        names.add("James");
        names.add("Jenny");

        names.remove(0);
        System.out.println(names);
    }
}
