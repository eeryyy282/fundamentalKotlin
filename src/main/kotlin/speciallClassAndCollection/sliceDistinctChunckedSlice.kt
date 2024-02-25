fun main(args: Array<String>) {
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val total2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 6, 7, 3, 2, 1, 5)

    //slice
    val slice = total.slice(1..6)
    println(slice)

    //disctinct
    val distinct = total2.distinct()
    println(distinct)

    //chunked (like split but it is for string)
    val word = "ABCDEFGQWERTY"
    val chunked = word.chunked(3)
    println(chunked)
}