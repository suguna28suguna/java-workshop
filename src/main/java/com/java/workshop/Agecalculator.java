package com.java.workshop;

import java.time.LocalDate;
import java.util.Scanner;

public class Agecalculator {
        public static void main(String[] args) {
        Scanner inputScanner=new Scanner(System.in);
        System.out.println("Enter your Dateofbirth (YYYY-MM-DD):");
        String Dateofbirth = inputScanner.nextLine();
        LocalDate Birthdate=LocalDate.parse(Dateofbirth);
        int YearofBirth=Birthdate.getYear();
        int currentYear=LocalDate .now().getYear();
        int age=currentYear-YearofBirth;
        System.out.println("your age is:"+age);
    }

}
