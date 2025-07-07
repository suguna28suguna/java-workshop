package src.com.java.workshop.basics;


public class Counting {
    public static void main(String[] args) {
        String sentence="This program shows how can we split a string into multiple string";
        String Words[]=sentence.split(" ");
        for (String word : Words){
        System.out.println(Words.length);
        }
    }

}
