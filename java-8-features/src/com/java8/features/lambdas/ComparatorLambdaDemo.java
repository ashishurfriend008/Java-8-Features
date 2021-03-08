package com.java8.features.lambdas;

import java.util.Comparator;

public class ComparatorLambdaDemo {

    public static void main(String[] args) {

        /**
         * prior java 8
         */
        Comparator<Integer> comparator = new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); //0 -> o1 == o2
                                         //1 -> o1 > o2
                                         //-1 -> o1 < o2
            }
        };
        System.out.println("Result of the comparator is "+comparator.compare(3 , 2));

        //implement comparator interface using lambda
        Comparator<Integer> comparatorLambda = (Integer a , Integer b) -> a.compareTo(b);
        System.out.println("Result of the comparator lambda is "+comparatorLambda.compare(3 , 2 ));

        //lambda expressions are smart enough know which type caste input data types automatically
        Comparator<Integer> comparatorLambda1 = (a , b) -> a.compareTo(b);
        System.out.println("Result of the comparator lambda without giving input data types explicitly  is "+comparatorLambda.compare(3 , 2 ));




    }
}
