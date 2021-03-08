package com.java8.features.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsDemo {

    public static int sumOfNNumbers(List<Integer> integerList){
        return integerList.stream()
                .reduce(0,(x,y) -> x+y);//unboxing to convert Integer to int
    }

    /*
     sum() method is going to get the values one by one and perform the accumulation
     of the result and return the result as a output.
     */
    public static int sumOfNNumbersIntStream(){
        return IntStream.rangeClosed(1,6)
                //1
                //2
                //3
                //4
                //5
                //6
                .sum();
    }

    public static void main(String[] args){

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);

        System.out.println("Sum of N numbers :- " +sumOfNNumbers(integerList));

        System.out.println("Sum of N numbers using IntStream :-" +sumOfNNumbersIntStream());

    }
}
