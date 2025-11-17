

package org.example

fun main() {
    println("Welcome to the HouseholdPets Application")
     val myCat = Cat(name= "Garfiled", age= 8)

    myCat.info()
    myCat.makeSound()
    myCat.scratch()

    println()

    val myDog = Dog(name = "Odie", age = 5)


    myDog.info()
    myDog.makeSound()
    myDog.fetch()
}