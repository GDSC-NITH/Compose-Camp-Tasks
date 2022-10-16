fun main() {
    // Employee class object
    val employee = Employee("Steve",25,(10000..30000).random()) // generating random salary using random() function
    println("Name : ${employee.name}")
    println("Age : ${employee.age}")
    println("Salary : ${employee.salary}")
    employee.display()

// Student class object
    val student = Student("Marie",17,(350..500).random()) // generating random total marks using random() function
    println("Name : ${student.name}")
    println("Age : ${student.age}")
    println("Salary : ${student.marks}")
    student.display()

}

// Base Class : Person
open class Person(name:String,age:Int){
    var name:String = name
    var age:Int = age
}

// Child Class : Employee
// Inherit properties from Person(Base Class)
class Employee(name:String,age:Int,salary:Int):Person(name,age){
    var salary:Int = salary

    fun display(){
        println("Class : Employee")
    }
}


// Child Class : Student
// Inherit properties from Person(Base Class)
class Student(name:String,age:Int,marks:Int):Person(name,age){
    var marks:Int = marks

    fun display(){
        println("Class : Student")
    }
}