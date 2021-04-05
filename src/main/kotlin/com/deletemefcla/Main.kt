package com.deletemefcla

class Main private constructor() {

    companion object Main {
        fun generateHelloWorld(name: String): String {
            return "Hello World $name!"
        }
    }
}

fun main() {
    println(Main.generateHelloWorld("Robert"))
}
