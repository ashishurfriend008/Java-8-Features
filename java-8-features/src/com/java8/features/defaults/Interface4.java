package com.java8.features.defaults;

public interface Interface4 {
    default void methodA(){
        System.out.println("Inside Method A"+Interface4.class);
    }
}
