package com.java.workshop.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MarkList {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        marks.add(89);
        marks.add(78);
        marks.add(90);
        marks.add(98);
        marks.add(80);
        System.out.println("Marks:"+ marks);
        marks.sort(Comparator.naturalOrder());
        System.out.println("sorted Marks:"+marks);
        marks.sort(Comparator.reverseOrder());
        System.out.println("Reverse Sorted Marks:"+ marks);
        System.out.println("Highest Marks:" + marks.get(0));
    }
}
