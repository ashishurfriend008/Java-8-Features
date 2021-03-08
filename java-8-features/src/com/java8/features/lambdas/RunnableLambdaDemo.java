package com.java8.features.lambdas;

public class RunnableLambdaDemo {

    public static void main(String[] args) {

        /**
         * prior to java 8
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        new Thread(runnable).start();

        // java 8 lambda - ()->{}
        Runnable runnableLambda1 = () -> {
            System.out.println("Inside Runnable 2");
        };

        // single statement lambda expression - curly braces not needed
        Runnable runnableLambda2 = () -> System.out.println("Inside Runnable 3");

        //multiple statement require curly braces
        Runnable runnableLambda3 = () -> {System.out.println("Inside Runnable 5");
        System.out.println("Inside Runnable 5");};

        new Thread(runnableLambda1).start();
        new Thread(runnableLambda2).start();

        //if we don't need Runnable variable to pass to Thread
        new Thread(() -> System.out.println("Inside Runnable 4")).start();
        new Thread(runnableLambda3).start();


    }
}
