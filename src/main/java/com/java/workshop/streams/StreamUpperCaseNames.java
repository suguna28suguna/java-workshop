package com.java.workshop.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamUpperCaseNames {
    public static void main(String[] args) {
         List<String> names = new ArrayList<>();
        names.add("Kobiga");
        names.add("Ajeetha");
        names.add("Soya");
        names.add("Suguna");
        names.add("Papu");
        names.add("Mamta");
        names.stream()
        .filter(name -> name.startsWith("S") || name.startsWith("s"))
        .distinct().map(String::toUpperCase).forEach(System.out::println);
    }

}
