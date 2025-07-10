package com.java.workshop;
import java.util.Scanner;

public class Namegenarator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.next();
        System.out.println("Enter your gender:");
        String gender=sc.next();
        System.out.println("Enter your qualification:");
        String qualification=sc.next();
        if("Male".equalsIgnoreCase(gender)){
            System.out.println("Mr."+name+"qualification"+qualification);
        }
        else if("Female".equalsIgnoreCase(gender)){
            System.out.println("Ms. "+"name "+name+" qualification "+qualification);
        }
        else{
            System.err.println("Invalid gender");
        }
    }

}
