package com.company;

import java.util.List;
import java.util.stream.Collectors;

public class FiterStrings {

    public static List<String> filterString (List<String> list){
        return list.stream().filter(x -> x.startsWith("a") && x.length() == 3).collect(Collectors.toList());
    }
}
