package com.company;

import java.util.List;
import java.util.stream.Collectors;

public class CommaSeparated {

    public static String commaSeparated (List<Integer> list){
        return list.stream()
                .map(x -> x %2 == 0 ? "even" + x : "odd" + x)
                .collect(Collectors.joining(", "));
    }
}
