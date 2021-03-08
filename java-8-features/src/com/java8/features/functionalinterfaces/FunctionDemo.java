package com.java8.features.functionalinterfaces;

import java.util.function.Function;

public class FunctionDemo {

        // input is going to be string and output is also going to be string
        //However, the output is going to be the upper case version of input
        // that is being passed in function interface
        static Function<String,String> function = (name) -> name.toUpperCase();

        static Function<String,String> addString1 = (name) -> name.toUpperCase().concat("DEY");

        static Function<String,String> addString2 = (name) -> name.toUpperCase().concat("dey");

        public static void main(String[] args) {

            System.out.println("The result is "+ function.apply("ashish"));

            System.out.println("The result of andThen is "+ function.andThen(addString1).apply("ashish"));

            System.out.println("The result of compose is "+ function.compose(addString2).apply("ashish"));


        }
}
