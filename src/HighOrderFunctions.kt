fun main(args: Array<String>) {
    val test = Test()
    println(test.addTwo(3, 4))


}

//high level functions or high order functions :  accept functions as parameter or return function or do both
//lamda : function with no name

class Test {
    fun addTwo(num1: Int, num2: Int): Int {
        return num1 + num2
    }
}

interface TestInterface {
    fun execute(sum: Int)
}