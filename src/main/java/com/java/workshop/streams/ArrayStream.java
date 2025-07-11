package com.java.workshop.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayStream {
    public static void main(String[] args) {
        int[] marks = {90,89,67,56,33};
        long numberofsubjectpassed = Arrays.stream(marks)
        .filter(mark -> mark > 40).count();
        System.out.println(numberofsubjectpassed);

        IntStream markStream=Arrays.stream(marks);
        numberofsubjectpassed = markStream
        .filter(mark -> mark >40).count();
    }

}
