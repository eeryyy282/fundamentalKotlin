package com.dicoding.oop

import com.dicoding.oop.utils.sayHello

open class Animal(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean) {
    open fun eat() {
        println("$name sedang makan!")
    }

    open fun sleep() {
        println("$name sedang tidur")
    }
}

class Cat(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val furColor: String, val numberOfFeet: Int)
    : Animal(pName, pWeight, pAge, pIsCarnivore) {
    fun playWithHuman() {
        println("$name sedang bersama manusia!")
    }

    override fun sleep() {
        println("$name sedang tidur di kamar manusia!")
    }

    override fun eat() {
        println("$name sedang makan ikan!")
    }

}

fun main() {
    sayHello()
}