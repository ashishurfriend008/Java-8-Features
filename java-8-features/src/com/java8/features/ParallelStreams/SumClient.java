package com.java8.features.ParallelStreams;

import java.util.stream.IntStream;

/**
 * If you have mutable variables then do not use parallel stream at all.
 */
public class SumClient {

    public static void main(String[] args){

        Sum sum = new Sum();

        IntStream.rangeClosed(1,1000)
                .parallel()
                .forEach(sum::performSum);

        System.out.println(sum.getTotal());

    }
}
