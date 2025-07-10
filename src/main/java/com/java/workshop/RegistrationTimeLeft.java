package com.java.workshop;

import java.time.LocalTime;

public class RegistrationTimeLeft {
    public static void main(String[] args) {
        LocalTime currentTime =LocalTime.now();
        LocalTime registrLocalTime= LocalTime.of(18, 5, 59);
        int hoursLeft =registrLocalTime.getHour()- currentTime.getHour();
        int mintuesLeft =registrLocalTime.getMinute()- currentTime.getMinute();
        int secondsleft =registrLocalTime.getSecond()- currentTime.getSecond();
        System.out.println("You have "+hoursLeft+" hours, " +mintuesLeft+" Mintues,and "+secondsleft+"seconds left to register." );
    }

}
