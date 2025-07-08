package src.com.java.workshop;

import java.time.LocalDate;
import java.util.Scanner;

public class Agecalculator {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter your birth year:");
        int yearofBirth = inputScanner.nextInt();
        int currentyear = LocalDate.now().getYear();
        int age=currentyear-yearofBirth;
        System.out.println("your age is:"+age);
    }

}
