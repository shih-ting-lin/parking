package com.tina.parking;

import com.tina.parking.Car;

import java.time.LocalDateTime;

public class Tester {
    public static void main(String[] args) {
        LocalDateTime enter =
                LocalDateTime.of(2018,12,25,8,0,0);
        LocalDateTime leave =
                LocalDateTime.of(2018,12,25,11,0,0);
        com.tina.parking.Car car = new Car("001" , enter);
        car.setLeave(leave);
        System.out.println("總共停了" + car.getDuration() + "分鐘");
        long hours = (long)Math.ceil(car.getDuration()/60f);
        System.out.println("總共停了" + hours + "小時");
        System.out.println("停車費為：" + hours*30 + "元");
    }
}
