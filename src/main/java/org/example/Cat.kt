package org.example

class Cat(name: String, age: Int) : Animal(name,age) {
    override fun makeSound() {

    }
    fun scratch() {
        print("$name is scratching furniture!")
    }

}