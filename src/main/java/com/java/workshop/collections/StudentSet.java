package com.java.workshop.collections;

import java.util.HashSet;
import java.util.Set;

public class StudentSet {
    public static void main(String[] args) {
        Set<Integer> rollNos = new HashSet<>();
        rollNos.add(1001);
        rollNos.add(1002);
        rollNos.add(1003);
        rollNos.add(1004);
        rollNos.add(1005);
        System.out.println(rollNos);
    }
}
