package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase {
    public static List<String> upperCase(List<String> list){
        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
