package speciallClassAndCollection

data class UserData(val name: String, val age: Int)

fun main(){
   /* val userData = UserData("Acer", 21)
    val name = userData.component1()
    val age = userData.component2() */

    // alternateve componet
    val dataUser = DataUser("Acer", 30)
    val(name, age) = dataUser

    println("Im using laptop brand $name, and its has been $age years")
}