package src.com.java.workshop.standardlib;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CharacterBasedReaderExample {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("E:\\coding\\java-workshop\\README.md")))
        {
            String line;
            while((line = reader.readLine())!=null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("Error Reading file:"+e.getMessage());
        }
    }

}
