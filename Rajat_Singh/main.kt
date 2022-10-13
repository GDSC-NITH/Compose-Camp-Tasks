package com.example.kotlin

fun main() {
    //call class 
    var car1 =car("AudiA6",4,14,"manual and autonomus driving",(1000..9999).random())//random variable used for no.plate
    //function call
    printvalues(car1)
}

//basic class for different properties of vehicles
open class vehicle(company : String,noOfTyres:Int,mileage:Int){
    var company =company
    var noOfTyres=noOfTyres
    var mileage=mileage
}

//Inherit properties of vehicle class in car class
 class car(company: String,noOfTyres:Int,mileage:Int,system:String,numberPlate:Int) : vehicle(company,noOfTyres,mileage){
     var systemType = system
     var numberPlate=numberPlate
 }

//function for printing values
fun printvalues(Car: car){
    println("Company of the car is ${Car.company}.")
    println("No. of tyres in ${Car.company} is ${Car.noOfTyres}.")
    println("Mileage of the  ${Car.company} is ${Car.mileage}Km/L.")
    println("${Car.company} have ${Car.systemType} modes.")
    println("Number plate of ${Car.company} is DL "+ (1..10).random() +"C ${Car.numberPlate}.")
}

/* Output :
    Company of the car is AudiA6.
    No. of tyres in AudiA6 is 4.
    Mileage of the  AudiA6 is 14Km/L.
    AudiA6 have manual and auto driving modes.
    Number plate of AudiA6 is DL XC XXXX.
 */