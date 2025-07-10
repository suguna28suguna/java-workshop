package com.java.workshop.basics;

public class Wordcount {
       public static void main(String[] args) {
        String sentence="This program shows how can we split a string into multiple string.We need to find sentence word and letter count";
        String Words[]=sentence.split(" ");
        System.out.println(Words.length);
        String sen[]=sentence.split("");
        System.out.println(sen.length);
        String dot[]=sentence.split("\\.");
        System.out.println(dot.length);     
    }
}
