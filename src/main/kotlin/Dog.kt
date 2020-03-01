
open class Animal(val name:String)

class Person(name:String):Animal(name)

class Dog(name:String, val owner:Person):Animal(name) {
    var tailIsWagging = false

    fun wagTail() {
        tailIsWagging = true
    }
}
