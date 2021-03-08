package com.java8.features.lambdas;

import java.util.function.Consumer;

public class LambdaVariable1Demo {

    public static void main(String[] args) {
         int i = 1;

         //the same variable is not allowed as i is already defined in this method scope
        //
        Consumer<Integer> c1 = (i1) -> {
            //this is not allowed as i is already defined in this method scope
            //int i =2;
            System.out.println("The value is "+i);
        };
    }
}
