package com.java8.features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Use case - calculate the max element out of the input list
 * using the reduce() function.
 * While calculating the max value it is recommended to use Optional as
 * return type.
 *
 */
public class StreamMinMaxDemo {

    /*
    for every element from the stream it is going to pass these elements one by one
    . x variable holds the max value for each element in the iteration.All these values
    from the stream is going to assign in y variable and the result of this is assign to
    x variable.For the first element when 6 is passed, x will hold the value 0.if 0 > y i.e.6
    and going to return 6 as the greatest element and that value will be assigned to x. When
    next element 7 comes in x will hold 6 the result of previous iteration and 7 is the current
    value in the stream and compares 6 > 7 no, then y will be return. For next iteration, 7 will
    be assigned to x variable.After that, we are going to call this function and find out the max
    value.If there is integer list is empty the the max value is return as 0.Ideally it should re-
    turn as empty not 0.It is returning as 0 because it has default value set and this is not correct.
    Avoid setting default value whenever you are performing min or max values from the stream of
    integers.
     */
    public static int findMaxValue(List<Integer> integerList){

        return integerList.stream()
                //6 -> y
                //7 -> y
                //8 -> y
                //9 -> y
                //10 -> y
                //x variable hold the max value for each element in the iteration
                .reduce(0,(x,y) -> x > y ? x : y);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList){

        return integerList.stream()
                //6 -> y
                //7 -> y
                //8 -> y
                //9 -> y
                //10 -> y
                //x variable hold the max value for each element in the iteration
                .reduce((x,y) -> x > y ? x : y);
    }

    public static void main(String[] args){

        //Integer list
        // List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        List<Integer> integerList = Arrays.asList();

        int maxValue = findMaxValue(integerList);

        System.out.println("Max value is " +maxValue);

        Optional<Integer> maxValueOptional = findMaxValueOptional(integerList);
        System.out.println("Optional max is " +maxValueOptional);
        if(maxValueOptional.isPresent()){
            System.out.println("maxValue using Optional :- " +maxValueOptional.get());
        }else{
            System.out.println("Input list is empty");
        }



    }
}
