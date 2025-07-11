package com.java.workshop.streams;

import java.util.ArrayList;
import java.util.List;

public class NameStartsWithSCount {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("kobiga");
        names.add("ajeetha");
        names.add("soya");
        names.add("suguna");
        long namecount = names.stream()
        .filter(name -> name.startsWith("s")).count();
        System.out.println(namecount);
    }

}
