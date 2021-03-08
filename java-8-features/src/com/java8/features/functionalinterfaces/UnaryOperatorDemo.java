package com.java8.features.functionalinterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

    static UnaryOperator<String> unaryOperator = (s) -> s.concat("Jena");
    public static void main(String[] args) {

        //applied the concat operation to the input that we pass
        System.out.println(unaryOperator.apply("Swati"));

    }
}
