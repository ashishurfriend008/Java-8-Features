package com.java8.features.defaults;

import java.util.Arrays;
import java.util.List;

/**
 * We
 */

public class MultiplierClient {

    public static void main(String [] args){

        Multiplier multiplier = new MultiplierImpl();
        List<Integer> integerList = Arrays.asList(1,3,5);

        //before java 8
        System.out.println("Result is " +multiplier.multiply(integerList));

        //Prior to Java 8
        System.out.println("Default method size is " +multiplier.size(integerList));
        System.out.println("Static method isEmpty is " +Multiplier.isEmpty(integerList));


    }
}
