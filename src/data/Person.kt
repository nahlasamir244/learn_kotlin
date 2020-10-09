package data

class Person(var id:Int){ //constructor
    var name:String="nahla"
    var age:Int=1
    fun display():Unit{
        print(name+"    ")
        print(age)
        print("\n============ \n")
    }
    fun ageMulTwo():Int{
        return age*2;
    }

    override fun toString(): String {
        return super.toString()
    }

}