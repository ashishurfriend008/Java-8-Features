package com.java8.features.optional;

import java.util.Optional;

/**
 * isPresent() will tell there is value present or not.
 * ifPresent() will tell there is a value present or not then it
 * gives an additional operation that can be performed on top of
 * optional object.
 */
public class OptionalPresentDemo {

    public static void main(String[] args){

        //if present
        Optional<String> stringOptional = Optional.ofNullable("Hello Ashish !!");
        System.out.println(stringOptional.isPresent());
        if(stringOptional.isPresent()){
            //it will give the actual value that it encapsulates
            System.out.println(stringOptional.get());
        }

        //is present
        stringOptional.ifPresent(s -> System.out.println(s));

    }
}
