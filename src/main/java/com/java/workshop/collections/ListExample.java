package com.java.workshop.collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("kobiga");
        names.add("ajeetha");
        names.add("soya");
        names.add("suguna");
         
        System.out.println("Names List:"+names);
        for(String name:names){
            System.out.println("Names:"+name);
        }
         names.subList(5, 0);
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Names at index"+ i +"." +names.get(i));
            
        }
        
    }
}
