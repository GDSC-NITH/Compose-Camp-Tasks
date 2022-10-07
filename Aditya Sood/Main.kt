fun main() {
    //Creating object p1 of Cricketer class
    val p1 = Cricketer("Aditya",18,(1..100).random(),3800) //Generating jersey number using random() function
    println("Name: ${p1.name}")
    println("Age: ${p1.age}")
    println("Jersey No.: ${p1.jerseyNo} ")
    println("Runs Scored: ${p1.runsScored}")
    val p1_strikeRate = strikeRate(3800,1700) //Calculating Strike Rate of player using strikeRate() function
    println("Strike Rate : ${p1_strikeRate}")
    p1.isCricketer()

    println("")

    //Creating object p2 of Footballer class
    val p2 = Footballer("Ronaldo",32,(1..100).random(),340) //Generating jersey number using random() function
    println("Name: ${p2.name}")
    println("Age: ${p2.age}")
    println("Jersey No.: ${p2.jerseyNo} ")
    println("No of goals: ${p2.goalsScored}")
    p2.isFootballer()
}


//Class containing basic properties of a Player
open class Player(name:String,age:Int,jerseyNo:Int){
    var name:String = name
    var age:Int = age
    var jerseyNo:Int= jerseyNo
}

//Inheriting the basic properties of Player class to a Cricketer class
class Cricketer(name:String,age:Int,jerseyNo:Int,runsScored:Int):Player(name,age,jerseyNo){
    var runsScored:Int = runsScored
    fun isCricketer(){
        println("Profession : Cricketer")
    }
}

//Inheriting the basic properties of Player class to Footballer class 
class Footballer(name:String,age:Int,jerseyNo:Int,goalsScored:Int,):Player(name,age,jerseyNo){
    var goalsScored:Int = goalsScored
    fun isFootballer(){
        println("Profession : Footballer")
    }
}


//Function to calculate strikeRate of the cricketer
fun strikeRate(runs:Int,balls:Int):Int{
    var strikeRate = (runs/balls)*100
    return  strikeRate
}





