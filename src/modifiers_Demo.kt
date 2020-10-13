//all fun and class and properties by default public
//private : visible in same file or class (can be accessed)
//internal : visible in same module
//protected is not applicable for high level fun or classes
//------------------------------------------------------------------------------

//abstract class used to provide family behavior with no implementation

abstract class Animal { // abstract class by default open
    private val a = 1
    protected open val b = 2
    protected abstract val abs: Int
    internal val c = 3
    var g = 6 //by default public
    abstract fun display() //by default open and must be overridden
    //other fun by default public final
    //cannot create object of abstract class
}

class Dog(override val abs: Int, override var name: String) : Animal(), Pet, Mumble { //this is how to extend class and implement interface
    //override abstract property = initialize it's value
    override val b: Int = 1
    fun test() {
        print("values are $b $c $g vs a is not visible")
    }

    override fun display() {
        TODO("Not yet implemented")
    }

    override fun eat() {
        TODO("Not yet implemented")
    }

    override fun print() { // if class implement 2 interface has 2 normal methods with same name you must override the method
        TODO("Not yet implemented")
        super<Pet>.print()
    }



}

interface Pet {
    //all fun and properties in interface by default open
    var name: String//all properties are abstract
    abstract fun eat()
    fun print() { //normal method : fun in interface can be not abstract and its open by default
        println("pet name $name")
    }
}

interface Mumble {
    fun print() {
        println("mumble")
    }
}