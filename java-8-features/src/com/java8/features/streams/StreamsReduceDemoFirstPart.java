package com.java8.features.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class StreamsReduceDemoFirstPart {

    public static int performMultiplication(List<Integer> integerList){

        // return a new result for every value that is being passed from the stream
        return integerList.stream()
                //1
                //3
                //5
                //7
                //a =1, b=1(from stream) => result 1 is returned
                //a =1(result from previous step), b = 3(from stream) => result 3 is returned
                //a =3, b =5(from stream) => result 15 is returned
                //a =15 , b =7(from stream) => result 105 is returned
                .reduce(1, (a,b) -> a*b); // This is the background operation that streams performs the multiplications of all the values in the stream.
    }


    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList){

        // return a new result for every value that is being passed from the stream
        return integerList.stream()
                //1
                //3
                //5
                //7
                //a =1, b=1(from stream) => result 1 is returned
                //a =1(result from previous step), b = 3(from stream) => result 3 is returned
                //a =3, b =5(from stream) => result 15 is returned
                //a =15 , b =7(from stream) => result 105 is returned
                .reduce((a,b) -> a*b); // This is the background operation that streams performs the multiplications of all the values in the stream.
    }


    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1,3,5,7);

        List<Integer> integers1 = new ArrayList<>();

        System.out.println(performMultiplication(integers));

        Optional<Integer> result = performMultiplicationWithoutIdentity(integers);

        System.out.println(result.isPresent());

        System.out.println(result.get());

        Optional<Integer> result1 = performMultiplicationWithoutIdentity(integers1);

        System.out.println(result1.isPresent());

        /*
        It will throw exception here i.e.no such element exception.So, it is best to
        check Optional has values or not, so that we can avoid exception.
         */
        if(result1.isPresent()) {
            System.out.println(result1.get());
        }






    }
}
