package com.dio.classes.bank

open class Person {

    var name: String = "Todd"
        set(value) {
            if (value.length < 3) {
                println("Name have to be more or equal to 3 characters")
            } else {
                field = value
            }
        }

    var age: Int = 0

    fun hiMessage(){
        println("Hello, my name is ${name}")
    }
}