fun main() {
    word()
    println(statement("Angie",24))
    println(city("Newyork"))
   person("Angela")
}

fun word(){
    val stmt="akirachix"
    println(stmt[1]+""+stmt[3]+stmt[4])
}

fun statement(name:String, age:Int):String{
    val stmt="Hi,my name is $name and I am $age years old."
    return stmt
}
fun city(city:String):Int{
    val town=city.length
    return town
}

fun person(name:String){
    val per = "Angela"
    if (name.equals("Angela")){
        println("That's me!")
    } else {
        println("I don't know who that is")
    }
}
