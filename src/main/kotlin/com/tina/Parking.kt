package com.tina

import java.time.Duration
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val enter = LocalDateTime.of(2018,12,25,8,0,0)
    val leave = LocalDateTime.of(2018,12,25,11,13,0)
    val car = Car("111",enter)
    car.leave = leave
    println("總共停了${car.duration()}分鐘")
    val hours = Math.ceil(car.duration()/60.0).toLong()
    println("總共是${hours}小時")
    println("停車費為:${hours*30}元")


}
class Car (val id :String, val enter: LocalDateTime) {
    var leave:LocalDateTime?=null
        set(value){
            if (enter.isBefore(value))
                field = value
        }
    fun duration()= Duration.between(enter,leave).toMinutes()
}


