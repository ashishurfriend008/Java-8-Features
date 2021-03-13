package com.java8.features.defaults;

/*
If both the interfaces have similar method signature then implement that method in the implementation class itself.
 */

public class Client14 implements Interface1,Interface4  {

    public void methodA(){
        System.out.println("Inside Method A"+Client14.class);
    }

    public static void main(String [] args){

        Client14 client14 = new Client14();
        client14.methodA();



    }
}
