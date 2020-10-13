// == reference equality
//Data classes has override implementation for == , toString() , has  copy() fun
data class User(var name: String, var gender: Int, var job: String) { // primary constructor of data classes cannot contain parameters

    //static functions and properties
companion object { //can have name or can be removed
    var count=0
        @JvmStatic
        fun printCount(){

        }
}
}

//singleton have only one instance in whole application
//singleton = static in java
//declare objects as classes and kotlin creates a singleton object of it
//this called a high level member object outside class
object Work : A() {
    //don't have constructors
    //static methods
    fun myFun() {
        println("my static function")
    }

    //static variables
    var s = 1

    //can have init block
    init {
        print("init..")
    }
}

open class A {
    fun myMethod() {
        println("my method")
    }
}

fun main() {
    var user1 = User("nahla", 2, "Mobile Developer")
    var user2 = User("ali", 1, "backend Developer")
    var user3 = User("ali", 1, "backend Developer")

    //this is how to define another female mobile developer with different name
    var user4 = user1.copy(name = "alaa")
    println(user2 == user3)
    println(user4.toString())
    println(Work.s)
    Work.myFun()
}

