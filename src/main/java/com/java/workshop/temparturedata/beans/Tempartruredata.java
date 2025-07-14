package com.java.workshop.temparturedata.beans;



public class Tempartruredata {
    public static void main(String[] args) {
        Organaization vet = new Organaization("vetias",
                                         "thindal",
                                         "www.vetias.com",
                                          "vetias@gmail.com",
                                          "123456789",
                                          123456
                                          );
    System.out.println(vet.name());
    System.out.println(vet.completeAddress());
    System.out.println(vet.Website());
    System.out.println(vet.email());
    System.out.println(vet.phoneNumber());
    System.out.println(vet.registrationNumber());
   }
}