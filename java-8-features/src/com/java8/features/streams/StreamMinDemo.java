package com.java8.features.streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Use case - How to perform the min operation of list of integers in a stream.
 * Calculating the min value using the reduce() function.
 */
public class StreamMinDemo {

    public static int findMinValue(List<Integer> integerList){

        return integerList.stream()
                //6 -> y
                //7 -> y
                //8 -> y
                //9 -> y
                //10 -> y
                //x variable hold the max value for each element in the iteration
                .reduce(0,(x,y) -> x < y ? x : y);
    }

    public static Optional<Integer> findMinValueOptional(List<Integer> integerList){

        return integerList.stream()
                //6 -> y
                //7 -> y
                //8 -> y
                //9 -> y
                //10 -> y
                //x variable hold the max value for each element in the iteration
                .reduce((x,y) -> x < y ? x : y);
    }

    public static void main(String[] args){

        //List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        List<Integer> integerList = Arrays.asList();

        int minValue = findMinValue(integerList);
        System.out.println("Min value :- "+minValue);

        Optional<Integer> minValueOptional = findMinValueOptional(integerList);
        System.out.println("Optional min is " +minValueOptional);
        if(minValueOptional.isPresent()){
            System.out.println("minValue using Optional :- " +minValueOptional.get());
        }else{
            System.out.println("No input is passed");
        }



    }
}
