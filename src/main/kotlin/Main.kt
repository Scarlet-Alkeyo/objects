import java.awt.Label

fun main(){
    var human =Human("Scarlet",19,54.0)
    human.eat(3.0)

    human.speak()
    human.birthday()
    var students=user("Scarlet","Muthoni","marymuthoni@gmail.com","0708670908", "hugtfrdf")
    println(students.email)
    println(students.firstname)
    var user = Person(50.0,19,"Scarlet", "Ada lab")
    println(user.name)
    println(user.weight)
    println(user.lab)
    println(user.age)

}
// var car = Car("Toyota","prado","KDD123F",0)
//   println(car.make)
//    car.start()
//    println(car.speed)
//    car.accelerate(40)
//    println(car.speed)
//    car.accelerate(80)
//    car.decelerate(20)
//    println(car.speed)
//    println(car.speed)
//    println(car.speed)
//    car.stop()
//    println(car.speed)
//    var myBook =Book("Tell me lies","Teresa",123)




//class  Car(var make:String,var model:String,var registration:String,var speed:Int){
//
//    fun start(){
//        println("chogiogiogio,vrooooom")
//    }
//    fun accelerate(acceleration:Int):Int{
//        speed+=acceleration
//        return speed
//    }
//    fun decelerate(deceleration:Int):Int{
//        speed-=deceleration
//        return speed
//    }
//    fun hoot(){
//        println("vroom,peepeee")
//    }
//    fun stop(){
//        speed = 0
//    }
//    data class Book(
//        var title:String,
//        var author:String,
//        var pages:Int
//    )


class Human(var name:String,var age:Int,var weight:Double){
    fun eat(foodWeight:Double){
        weight +=foodWeight
        println("I am eating $foodWeight kg of food")
    }
    fun speak(){
        println("Hello")
    }
    fun birthday(){
        age++
        println(age)
    }
}
data class user(
        var  firstname:String,
        var  lastname:String,
        var email:String,
        var phoneNumber:String,
        var password:String,
        )

 data class  Person(var weight:Double,var age: Int,var name: String,var lab: String)







