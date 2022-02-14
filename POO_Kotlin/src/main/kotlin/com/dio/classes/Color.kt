package com.dio.classes

enum class Color(val colorName:String):DoColor {
    GREEN("Green") {
        override fun helloFromColor() {
            println("Hi, I'm the green color")
        }
    },
    BLUE("Blue") {
        override fun helloFromColor() {
            println("Hi, I'm the blue color")
        }
    },
    RED("Red") {
        override fun helloFromColor() {
            println("Hi, I'm the red color")
        }
    },
    WHITE("White") {
        override fun helloFromColor() {
            println("Hi, I'm the white color")
        }
    }
}