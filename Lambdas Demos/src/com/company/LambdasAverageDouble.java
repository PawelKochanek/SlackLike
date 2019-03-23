package com.company;

import java.util.List;

public class LambdasAverageDouble {

    public static Double average (List <Integer> list){

        return list.stream()
                .mapToInt(x -> x)
                .average()
                .getAsDouble();
    }
}

