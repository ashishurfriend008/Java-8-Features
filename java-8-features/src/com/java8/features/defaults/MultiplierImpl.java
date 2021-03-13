package com.java8.features.defaults;

import java.util.List;

public class MultiplierImpl implements Multiplier{
    @Override
    public int multiply(List<Integer> integerList) {
        return integerList.stream()
                .reduce(1,(x,y) -> x*y);
    }

    //Default method can be overridden
    public int size(List<Integer> integerList){
        System.out.println("Inside Multiplier Impl Class");
        return integerList.size();
    }
}
