package com.java8.features.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableDemo {

    public static Optional<String> ofNullable() {
        Optional<String> stringOptional = Optional.ofNullable("Hello Ashish !!");
        return stringOptional;
    }

    public static Optional<String> ofNullableEmpty() {
        //empty optional object
        Optional<String> stringOptionalEmpty = Optional.ofNullable(null);
        return stringOptionalEmpty;
    }

    public static Optional<String> of() {
        Optional<String> stringOptionalOf = Optional.ofNullable("Hello Ashish !!");
        return stringOptionalOf;
    }

    public static Optional<String> ofNull() {
        Optional<String> stringOptionalOfNull = Optional.of(null);
        return stringOptionalOfNull;
    }

    //return empty object as a result
    public static Optional<String> empty(){
        return Optional.empty();
    }

    public static void main(String[] args){
        System.out.println(ofNullable().get());
        //empty optional object
        System.out.println("ofNullable :- " +ofNullableEmpty().isPresent());
        System.out.println("of :- " +of().get());
        System.out.println("empty :- " +empty());
        //gives null pointer exception
        System.out.println("ofNull :- " +ofNull());

    }

}
