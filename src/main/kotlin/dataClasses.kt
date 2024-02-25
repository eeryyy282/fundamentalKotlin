class User(val name: String, val age: Int) {
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
}

class  User2(val name: String, val age: Int) {
    override fun equals(other: Any?): Boolean {
        if (this == other) return true
        if (javaClass != other?.javaClass) return false

        other as User2

        if (name != other.name) return false
        if(age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 50 * result + age
        return result
    }
}

data class DataUser(val name: String, val age: Int)

fun main(){
   /* val user = User("Juzairi", 20)
    val dataUser = DataUser("Safitli", 19)
    println(user)
    println(dataUser) */

    val dataUser1 = DataUser("Juzairi", 21)
    val dataUser2 = DataUser("Safitli", 10)
    val dataUser3 = DataUser("KOtlin", 22)

    println(dataUser2)
    println(dataUser3)
}