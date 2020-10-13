//all fun and class and properties by default public
//private : visible in same file or class (can be accessed)
//internal : visible in same module
//protected is not applicable for high level fun or classes
open class Animal {
    private val a = 1
    protected val b = 2
    internal val c = 3
    var g = 6 //by default public
    fun display(){ //by default public final

    }
}

class Dog : Animal() {
    fun test(){
        print("values are $b $c $g vs a is not visible")
    }


}