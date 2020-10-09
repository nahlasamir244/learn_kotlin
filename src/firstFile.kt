import data.Person

fun main(args: Array<String>): Unit {
    //kotlin in runtime create the class file
    var myMessage = "Hello kotlin"
    var num = 1
    //shift + f6 refactoring
    //psvm for main()
    val immutableMessage: String //Type annotation
    immutableMessage = "hello " //Immutable String
    println("Hello world ..")
    print(myMessage)
    print("\n")
    val personObj = Person(1)
    personObj.display()
    //String interpolation
    println("the age of person multiplied by 2 is ${personObj.ageMulTwo()}")
    //REPL read evaluate print loop to run kotlin code -> tools - kotlin - repl
    //run : ctrl + enter , mul line only enter
    //kotlin all DT ar objects and no default value
    //var : mutable , val : immutable
    var longVal = 11L //literal inline intiallization
    var pi: Float = 13.4f
    var gender: Char = 'm'
    //ranges :
    var range1 = 1..10 //[1,10]
    var range2 = 7 downTo 3 // descending order
    var range3 = 50 downTo 0 step 3
    var alphaRange = 'a'..'z' step 2
    var isPresent = 'a' in alphaRange
    var downAlpha = 'z'.downTo('a')
    var AscAlpha = 'a'.rangeTo('z')
    var (x, y, z) = arrayOf(1, 5, 7)
    //if as expression not as statement
    var maxValue: Int = if (x > y) {
        print("x>y")
        //the last statement is the return statement 
        x
    } else {
        print("x<y")
        y
    }
    println("max value is $maxValue")
}
