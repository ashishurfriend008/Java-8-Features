package com.java8.features.methodreference;

/**
 * IntelliJ has the code to convert Lambda expression to method reference.
 */

import java.util.function.Function;

public class FunctionMethodReferenceDemo {

    static Function<String, String> toUpperCase = (s) -> s.toUpperCase();

    static Function<String, String> toUpperCaseMethodReference = String::toUpperCase;

    public static void main(String[] args) {

        System.out.println("The UpperCase is "+toUpperCase.apply("ashish"));

        System.out.println("The UpperCase Method Reference is "+toUpperCaseMethodReference.apply("ashish"));

    }
}
