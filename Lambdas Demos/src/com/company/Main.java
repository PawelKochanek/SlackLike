package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
///////////////////////////  LambdasAverageDouble //////////////////////
    public static void main(String[] args) {
//        List <Integer> averageDouble = new ArrayList<>();
//        for (int i = 2; i < 12; i += 2) {
//            averageDouble.add(i);
//        }
//        System.out.println(LambdasAverageDouble.average(averageDouble));
//    }
///////////////////////////// ToUpperCase ////////////////////////////////////

//        List <String> majtekRodzaje = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//
//        while(true){
//            String word = sc.next();
//            if(word.equals("end")){
//                break;
//            }
//            majtekRodzaje.add(word);
//        }
//        System.out.println(ToUpperCase.upperCase(majtekRodzaje));

///////////////////////////// FilterStrings /////////////////////////////////////

//        List<String> toFilter = Arrays.asList("Lorem",
//                "ipsum", "dolor", "sit amet",
//                "consectetur", "arg",
//                "adipiscing elit", "arr");
//
//        System.out.println(FiterStrings.filterString(toFilter)); // szuka wyrazow zaczynajacych sie od 'a' i majacych 3 znaki

/////////////////////////// CommaSeparated /////////////////////////////////

        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(CommaSeparated.commaSeparated(ints)); // dopisuje info o liczbach i oddziela je przecinkiem
    }
}
