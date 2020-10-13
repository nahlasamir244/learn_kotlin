// == reference equality
//Data classes has override implementation for == , toString() , has  copy() fun
 data class User(var name:String,var gender:Int,var job:String){ // primary constructor of data classes cannot contain parameters
    //singletone = static in java

 }

 fun main() {
     var user1 = User("nahla",2,"Mobile Developer")
     var user2 = User("ali",1,"backend Developer")
     var user3 = User("ali",1,"backend Developer")

     //this is how to define another female mobile developer with different name
     var user4 = user1.copy(name="alaa")
     println(user2==user3)
     println(user4.toString())
 }

//singleton have only one instance in whole application