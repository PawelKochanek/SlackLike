package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj ścieżkę do pliku: ");
        String path = sc.next();

        System.out.println("Jakie chcesz złowo zamienić: ");
        String origin = sc.next();

        System.out.println("Na jakie słowo chcesz je zamienić?: ");
        String toReplace = sc.next();

        String content;
        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new FileReader(path));
        br.lines().forEach(o->sb.append(o));
        content = sb.toString().replace(origin, toReplace);
        br.close();

        FileWriter fw = new FileWriter(path);
        fw.write(content);
        fw.close();
    }
}
