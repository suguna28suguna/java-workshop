package com.java.workshop.streams;

import java.util.Arrays;
import java.util.List;

public class MarkSorted {
    public static void main(String[] args) {
        List<Integer> marks = Arrays.asList(13,14,17,13,10);
        List<Integer> sortedmarks = marks.stream()
        .sorted()
        .toList();
        System.out.println("sorted Marks:"+sortedmarks);
        List<Integer> reverseDec=marks.stream().sorted((a,b) ->b.compareTo(a)).toList();
        System.out.println("Reverse Sorted Marks:"+reverseDec);
    }
}
