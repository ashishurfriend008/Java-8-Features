package com.java8.features.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIterateDemo {

    public static void main(String[] args){

        Stream<String> stringStream = Stream.of("adam", "dan", "julie");
        stringStream.forEach(System.out::println);

        Stream.iterate(1,x ->x*2)
                .limit(5)
                .forEach(System.out::println);

        //nextInt randomly generating integers from Integer class
        Supplier<Integer> integerSupplier = new Random()::nextInt;
        Stream.generate(integerSupplier)
                .limit(5)
                .forEach(System.out::println);


    }
}
