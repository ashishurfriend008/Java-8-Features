package com.java8.features.numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamsRangesDemo {

    public static void main(String[] args){

        IntStream intStreamRange = IntStream.range(1,50);
        System.out.println("Range Count :- "+intStreamRange.count());
        IntStream.range(1,50).forEach(value -> System.out.println(value + " , "));

        IntStream intStreamRangeClosed = IntStream.rangeClosed(1,50);
        System.out.println("RangeClosed Count :- "+intStreamRangeClosed.count());
        IntStream.rangeClosed(1,50).forEach(value -> System.out.print(value + " , "));

        LongStream longStreamRange = LongStream.range(1,50);
        System.out.println("LongStream Range Count :- "+longStreamRange.count());
        LongStream.range(1,50).forEach(value -> System.out.print(value + " , "));

        LongStream longStreamRangeClosed = LongStream.rangeClosed(1,50);
        System.out.println("LongStream rangeClosed Count :- "+longStreamRangeClosed.count());
        LongStream.rangeClosed(1,50).forEach(value -> System.out.print(value + " , "));

        //asDoubleStream() is a part of both IntStream and LongStream
        IntStream.range(1,50).asDoubleStream().forEach(value -> System.out.print(value + " , "));


    }
}
