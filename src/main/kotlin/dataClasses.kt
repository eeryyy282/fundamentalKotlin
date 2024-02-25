class User(val name: String, val age: Int) {
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
}

data class DataUser(val name: String, val age: Int)

fun main(){
    val user = User("Juzairi", 20)
    val dataUser = DataUser("Safitli", 19)
    println(user)
    println(dataUser)
}