package com.tina;

import java.time.LocalDateTime;

public class Tester {
    public static void main(String[] args) {
        LocalDateTime enter =
                LocalDateTime.of(2018,12,25,8,0,0);
        LocalDateTime leave =
                LocalDateTime.of(2018,12,25,11,0,0);
        Car car = new Car ("001" , enter);
        car.setLeave(leave);
        System.out.println(car.getDuration());
        long hours = (long)Math.ceil(car.getDuration()/60f);
        System.out.println(hours);
        System.out.println(hours*30);
    }
}
