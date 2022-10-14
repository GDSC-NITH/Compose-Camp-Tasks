//Class
open class Developer( name : String, age : Int){
    init {
        println("I, $name, am a Developer and have lived more than $age years of my life")
    }
}
//Inherited Class
class appDeveloper(name : String, age : Int) : Developer(name, age){
    fun app(){
        println("By the way I create apps (:")
    }
}
//Another Inherited Class
class webDeveloper(name : String, age : Int) : Developer(name, age){
    fun web(){
        println("Hey, I create the cool stuff where you spend your whole day procastinating")
    }
}

fun main(){
    val AP = appDeveloper("Aryan Prasher",18)
    AP.app()
    val sg = webDeveloper("Semi God", 20)
    sg.web()
}