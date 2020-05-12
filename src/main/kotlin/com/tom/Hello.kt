package com.tom

fun main(args: Array<String>) {
//    println("hello kotlin")
    val h = Human()
    h.hello()
    var age : Int =25;
    val weight = 65.5
    val enroll : Boolean = true
    println(age)
}

class Human{
    fun hello(){
        println("Hello kotlin")
    }
}