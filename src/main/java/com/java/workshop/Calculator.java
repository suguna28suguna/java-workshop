package com.java.workshop;

public class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int Subtract(int a,int b){
        return a-b;
    }
    public int divide(int a,int b){
        try{
             if(b==0){
                throw new ArithmeticException("Division by zero is not allowed:");
            }
            
            
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
            return 0;
        }
        return a/b;
    }

    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        System.out.println("Division:"+calculator.divide(6,10));
        System.out.println("Addition:"+calculator.add(5,3));
        System.out.println("Subtraction:"+ calculator.Subtract(10,4));
    }
}
