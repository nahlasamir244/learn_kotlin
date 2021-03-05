//change .class name instead of fileNameKt.class to nahlaFile.class
@file:JvmName("nahlaFile")

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
    var mychpro:CharProgression = 'a' .. 'z' step 3
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
    var s:Boolean = true
    //when = switch : no need for break once case is true it breaks
    //when as expression instead of value assign different times
    var test = 10
    var testCP: Int
    testCP = when (test) {
        1, 10 -> {
            println("test is 1 or 10")
            1
        }
        5, 10 -> 5
        in 19..39 -> 9
        !in 90..100 -> 20
        else -> -1
    }
    print(testCP)
    //iterators
    for (i in 1..4 step 1) {
        println("hello $i")
    }
    var j =0
    while (j<10){
        print("hello ${j}")
        j++
    }
    var i = 1
    while (i < 5) {
        if (i == 2) {
            println("break")
            //ends the whole loop the nearest loop if there is nested loop
            break
        }
        println("hello $i")
        i++
    }
    i = 1
    do {
        println("hello $i")
        i++
    } while (i < 5)

    //example of break outer loop using label
    outerLoop@ for (i in 1..3) {
        for (j in 1..3) {
            println("$i .. $j")
            if (i == j && i == 2) {
                break@outerLoop
            }
        }
    }
    //continue skip only the current iteration and continue the loop
    fun skipfiveMulinRange(range: IntRange) {
        for (i in range) {
            if (i % 5 == 0) {
                continue
            }
            println(i)
        }
    }
    skipfiveMulinRange(1..20)

    fun sum(num1: Int, num2: Int): Int {
        return num1 + num2
    }
    println(sum(1, 2))
    fun sumRange(range: IntRange): Int {
        var sum = 0
        for (i in range) {
            sum += i
        }
        return sum
    }


    fun printPrimeInRange(range: IntRange) {
        outer@ for (i in range) {
            for (j in 2..i) {
                if (i % j == 0) {
                    continue@outer
                }
            }
            println(i)
        }
    }
    printPrimeInRange(5..40)
    printInseq(n2 = 50, n1 = 30, n4 = 1)
    var str: String = ""
    val concatedStrings = str.concatStringsWithSpace("Hello", "my", "name", "is", "Nahla", "Samir ..")
    println("--------------------------")
    println(concatedStrings)
    print("\n ---------------")
    //infix function calling more readable
    personObj isEven 2
}

//function as expression using = instead of return
fun isEven(number: Int): Boolean = number % 2 == 0

//java and kotlin interoperability
//kotlin filenameKt.class the byte code

//calling java method inside kotlin code
var name = MyClass.getHelloMessage("nahla")

//default arguments if you dont override the default value
@JvmOverloads //since java doesnt have default argument functions
fun findVolume(length: Int, width: Int, height: Int = 10): Int = length * width * height


//named parameters in kotlin make it easy to provide parameter to function my name ignoring the order of the argument
fun printInseq(n1: Int, n2: Int, n3: Int = 3, n4: Int) {
    println("========================================")
    println(n1)
    println(n2)
    println(n3)
    println(n4)
}

//extension function : enables you to extend the class functionality without declaring it or inherit the class or use decorator design pattern

fun Person.isAdult() = age >= 18

fun String.concatStringsWithSpace(vararg str: String): String {
    var result = ""
    for (element in str) result += "$element "
    return result
}

//infix function : have single parameter increase the readability by removing . and () in calling

//tailRec : optimized recursive function avoid stack overflow : out of stack memory replace recursion with iteration