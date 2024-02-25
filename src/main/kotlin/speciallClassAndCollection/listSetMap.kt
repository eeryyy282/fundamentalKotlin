// list
val numberList: List<Int> = listOf(1, 2, 3, 4, 5)
val charList = listOf("a", "b", "c", "d")
val anyList = listOf("a", 2, "Kotlin", false)

//mutable list
val phoneList = mutableListOf("Samsung", "Xiaomi", "Nokia")

//set
val myFavoriteNumber = setOf(2, 45, 53, 88, 3)
val myDontLikeNumber = setOf(2, 88, 3, 45)


//union and intersect
val setC = setOf(1, 5, 7)
val union = myFavoriteNumber.union(setC)
val intersect = myFavoriteNumber.intersect(setC)

//map
val capital = mapOf(
    "Jakarta" to "Indonesia",
    "London" to "England",
    "New Delhi" to "India"
)

fun main() {
    println(numberList[3])

    //output test setOf
    println(myFavoriteNumber == myDontLikeNumber)

    //test value in setOf
    println(2 in myDontLikeNumber)

    //union and intersect output
    println(union)
    println(intersect)

    //output map
    println(capital["England"])
}