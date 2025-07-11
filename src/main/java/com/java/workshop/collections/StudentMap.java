package com.java.workshop.collections;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {
    public static void main(String[] args) {
        Map<Integer,String> students = new HashMap<>();
        students.put(1003, "vishnu");
        students.put(1005, "soya");
        students.put(1007, "suguna");
        students.put(1009, "sreeshatn");
        students.put(1001, "rithika");
        students.put(1008, "charan");
        System.out.println(students);
        System.out.println(students.keySet());  
        System.out.println(students.values());

    }
}