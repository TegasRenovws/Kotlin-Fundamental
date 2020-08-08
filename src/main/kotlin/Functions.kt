fun main(){
    val user = setUser("Reznov", "reading" ,16)
    println(user)
}
fun setUser(name: String, hobby: String, age: Int) = "My name is $name, i usually $hobby a manga and light novel, and i am $age years old"

fun printUser(name:String){
    println("Your name is $name")
}