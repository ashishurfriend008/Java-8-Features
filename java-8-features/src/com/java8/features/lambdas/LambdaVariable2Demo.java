package com.java8.features.lambdas;

/**
 * For instance variables you can reassign or modify or change the value but for
 * local variable it is not allowed. Inside the lambda body the local variable is
 * treated as effectively final.
 */

import java.util.function.Consumer;

public class LambdaVariable2Demo {

    static int value = 4;

    public static void main(String[] args) {

        //int value = 4;
        Consumer<Integer> c1 = (i) -> {
            value++;
            System.out.println(value+i);
        };
        c1.accept(4);
    }
}
