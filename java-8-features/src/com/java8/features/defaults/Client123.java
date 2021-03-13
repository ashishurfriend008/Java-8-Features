package com.java8.features.defaults;

public class Client123 implements Interface1,Interface2,Interface3{

    /*
    The class that overrides the default method takes precedence over any other implementation that
    we have in other interfaces.
    Order of methods called during runtime - class that implements the interface, the sub interface that
    extends the interface.
     */
    public void methodA(){
        System.out.println("Inside Method A"+Client123.class);
    }

    public static void main(String [] args){

        /*
        We are inheriting multiple behaviours from each and every interfaces.This
        concept is called multiple inheritance.This was never possible before java 8.
         */
        Client123 client123 = new Client123();
        client123.methodA(); //resolve to the child implementation
        client123.methodB();
        client123.methodC();
    }

}
