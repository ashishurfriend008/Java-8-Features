package com.java8.features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 *
 */
public class StreamLimitSkipDemo {

    /*
    perform  summation of stream from the list.It will limit the stream
    just process the two element in the stream.
    If there will be a use case where there are stream of 1000 elements and
    you do not want to process all 1000 elements to get result then you can
    limit the number of elements.
     */
    public static Optional<Integer> limit(List<Integer> integerList){

        return integerList.stream()
                //6
                //7
                //8
                //9
                //10
                .limit(3) //6,7,8
                .reduce((x,y) -> x+y);

    }

    //skip remaining two elements and skip first three elements.
    public static Optional<Integer> skip(List<Integer> integerList){

        return integerList.stream()
                //6
                //7
                //8
                //9
                //10
                .skip(3) //9,10
                .reduce((x,y) -> x+y);

    }

    public static void main(String[] args){

        List<Integer> integerList = Arrays.asList(6,7,8,9,10);

        Optional<Integer> limitResult = limit(integerList);
        if(limitResult.isPresent()){
            System.out.println("The limit result is " +limitResult.get());
        }else{
            System.out.println("No input is passed");
        }

        Optional<Integer> skipResult = skip(integerList);
        if(skipResult.isPresent()){
            System.out.println("The skip result is " +skipResult.get());
        }else{
            System.out.println("No input is passed");
        }

    }
}
