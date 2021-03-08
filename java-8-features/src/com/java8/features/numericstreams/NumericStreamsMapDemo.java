package com.java8.features.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsMapDemo {

    public static List<Integer> mapToObj(){
        return IntStream.rangeClosed(1,5)
                .mapToObj((i) -> {
                   return new Integer(i);
                })
                .collect(Collectors.toList());
    }

    public static long mapToLong(){
        return IntStream.rangeClosed(1,5)
                .mapToLong((i) ->i) //convert intStream to longStream
                .sum();
    }

    public static double mapToDouble(){
        return IntStream.rangeClosed(1,5)
                .mapToDouble((i) ->i) //convert intStream to DoubleStream
                .sum();
    }

    public static void main(String[] args){

        System.out.println("mapToObj :- "+mapToObj());

        System.out.println("mapToLong :- "+mapToLong());

        System.out.println("mapToDouble :- "+mapToDouble());

    }
}
