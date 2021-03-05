package data
//all classes in kotlin are close = final in java
class Person(var id: Int) { //constructor
    var name: String = "nahla"
    var age: Int = 30
    fun display(): Unit {
        print(name + "    ")
        print(age)
        print("\n============ \n")
    }

    fun ageMulTwo(): Int {
        return age * 2;
    }

    override fun toString(): String {
        return super.toString()
    }

    infix fun isEven(num: Int) = num % 2 == 0
}