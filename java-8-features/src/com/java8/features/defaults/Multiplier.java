package com.java8.features.defaults;

import java.util.List;

/**
 * Whatever logic implemented in Multiplier interface needs to be implemented only in MultiplierImpl class
 * prior java 8.
 * We can add new functionalities to the Multiplier interface and not affecting any of the class implementing
 * this interface.
 * Default methods can be overridden while static methods can not be overridden.
 */
public interface Multiplier {

    int multiply(List<Integer> integerList);

    /*
    return the size of the input list - new functionality introduced in java 8.
    The logic we have implemented in the interface itself.We can add functionality in
    Multiplier interface and not affecting any of the classes which implements this interface.
     */

    default int size(List<Integer> integerList){
            System.out.println("Inside Multiplier Interface");
            return integerList.size();
    }

    /*
    If the list is empty then this will return false and if
    the list is not empty then it will return true.
     */
    static boolean isEmpty(List<Integer> integerList){
        return integerList != null && integerList.size() > 0;

    }
}
