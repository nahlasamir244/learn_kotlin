package data

//in case you don't specify modifiers you can remove constructor keyword
open class Student constructor(var name: String, var id: Int = -1, age: Int = 0) { //primary constructor
    //var or val mean this is property of the class , age is just parameter not property
    var count = 0
    open var address = "student address"

    init {
        count++
        println("hello $name ")
        this.id = count
    }

    //secondary constructor has body , must call primary constructor
    //you cannot initialize property to secondary constructor
    constructor(name: String, address: String) : this(name) { //init execute before secondary constructor

    }

    open fun printStudent() {
        println("Student name $name")
        println("Student id $id")
    }
}

//notes about classes :
//they are by default public final you have to use keyword open to enable inheritance
//all kotlin classes inherit from class of Any
// .equals : content comparison vs == : reference comparison
//inheritance taking all the parameters and methods from parent class
class Senior(name: String) : Student(name, "dummy") { //you must call one of the parent constructors
    var gpa: Int = 0;
    override var address = "senior address"
    override fun printStudent() {
        super<Student>.printStudent() //inherit the parent behavior <T> to avoid ambiguity
        println("Student GPA $gpa") //extension to functionality
    }
    
}