package com.java8.features.ParallelStreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

/**
 * Use case - sumSequentialStream() and sumParallelStream() methods
 * going to be called 20 times.Then, how many mili seconds that it took
 * in order to calculate the output for you.
 */

public class ParallelStreamsDemo {

    //Total time it took to execute this method number of times i.e 20 times
    public static long checkPerformanceResult(Supplier<Integer> supplier, int numOfTimes){
       //how long it takes
        long startTime = System.currentTimeMillis();
        for(int i=0; i<numOfTimes; i++){
            //It will invoke sumSequentialStream() and sumParallelStream() methods.
            supplier.get();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static int sumSequentialStream(){
        return IntStream.rangeClosed(1,100000)
                .sum();
    }

    public static int sumParallelStream(){
        return IntStream.rangeClosed(1,100000)
                .parallel() //split the data into multiple parts and process them concurrently
                .sum();
    }

    public static void main(String[] args){
        //how many processors available in this machine
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println("Sequential Stream Result :- "
                +checkPerformanceResult(ParallelStreamsDemo::sumSequentialStream,20));
        System.out.println("Parallel Stream Result :- "
                +checkPerformanceResult(ParallelStreamsDemo::sumParallelStream,20));

    }
}
