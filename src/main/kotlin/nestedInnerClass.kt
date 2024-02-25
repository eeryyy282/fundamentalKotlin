class City {
    // property in City class
    // use inner for acces the property
    val contractor = 100
    val father = 3
    inner class House {
        val room = 4
        val father = 5
        fun totalFamilyMember() {
            println(contractor/room)
            // using father in outer class
            println(this@City.father)
        }
    }
}

fun main() {
    val city = City()
    val house = city.House()
    house.totalFamilyMember()
}