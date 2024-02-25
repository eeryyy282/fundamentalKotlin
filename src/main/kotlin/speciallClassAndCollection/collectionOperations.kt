fun main(args: Array<String>) {


    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    //filter
    val evenList = numberList.filter { it % 2 == 1 }
    println(evenList)

    //map
    val multipliedBy5 = numberList.map {  it * 5 }
    println(multipliedBy5)

    //count
    println(numberList.count())
    println(numberList.count { it % 3 == 0})

    //find and first or null
    val firstOddNumber = numberList.find { it % 2 == 1 }
    val firstOrNullNumber = numberList.firstOrNull{ it % 2 == 3}
    println(firstOddNumber)
    print(firstOrNullNumber)

    //first and last
    val moreThan10 = numberList.first{ it < 10}
    println(moreThan10)

    //sum
    val total = numberList.sum()
    println(total)

}