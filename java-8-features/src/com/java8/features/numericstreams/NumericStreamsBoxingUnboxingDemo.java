package com.java8.features.numericstreams;

import java.sql.SQLOutput;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxingDemo {

    /*
    created list of Integer type with 10 values.
    Here,IntStream iterates for 10 elements
     */
    public static List<Integer> boxing(){
        return IntStream.rangeClosed(1,10)
                //int
                .boxed()
                //Integer
                .collect(Collectors.toList());
    }

    public static int unBoxing(List<Integer> integerList){
        //Wrapper to Primitive
        return integerList.stream()
                .mapToInt(Integer::intValue) //intStream(intValue of the Wrapper class)
                .sum();
    }

    public static void main(String[] args){

        System.out.println("Boxing :-" +boxing());

        List<Integer> listInteger = boxing();

        System.out.println("Unboxing :- " +unBoxing(listInteger));


    }
}
