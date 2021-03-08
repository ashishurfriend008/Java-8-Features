package com.java8.features.functionalinterfaces;

public class FunctionExample1 {

    //concat string operation - DEY is the added str input that we have passed
    public static String performConcat(String str){
        return FunctionDemo.addString1.apply(str);
    }
    public static void main(String[] args) {

        String result = performConcat("Hello");

        System.out.println("Result :- " +result);

    }
}
