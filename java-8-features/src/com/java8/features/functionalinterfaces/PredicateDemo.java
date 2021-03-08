package com.java8.features.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateDemo {

    //Pass integer and check whether that integer is even number
    static Predicate<Integer> p = (i) -> {
        return i%2==0;
    };

    //rewrite the same code as above but in a single expression
    static Predicate<Integer> p1 = (i) -> i%2==0;

    static Predicate<Integer> p2 = (i) -> i%5==0;

    //And Operation
    public static void predicateAnd(){
        System.out.println("Predicate and result is "+p1.and(p2).test(10)); // predicate chaining;
        // we should always pass the test() method in order to test the input
        System.out.println("Predicate and another result is "+p1.and(p2).test(9));
    }

    //Or Operation
    public static void predicateOr(){
        System.out.println("Predicate or result is "+p1.or(p2).test(10)); // predicate chaining;
        // we should always pass the test() method in order to test the input
        System.out.println("Predicate or another result is "+p1.or(p2).test(8));
    }

    //Negate Operation
    public static void predicateNegate(){
        // we should always pass the test() method in order to test the input
        System.out.println("Predicate negate of or result is "+p1.or(p2).negate().test(8));
    }

    public static void main(String[] args) {

        System.out.println(p.test(4));

        System.out.println(p.test(4));

        predicateAnd();

        predicateOr();

        predicateNegate();

    }
}
