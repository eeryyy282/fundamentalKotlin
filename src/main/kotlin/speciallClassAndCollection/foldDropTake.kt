fun main() {
    val numbers = listOf(1, 2, 3)
    val numbers2 = listOf(1, 2, 3, 4, 5, 6)

    // fold
    val fold = numbers.fold(10) {current, item ->
        println("Current $current")
        println("item $item")
        println()
        current + item
    }
    println("Fold result = $fold")

    //fold right
    val foldRight = numbers.foldRight(10) {awal, akhir ->
        println("Awal $awal")
        println("Akhir $akhir")
        awal + akhir
    }
    println("Fold Kanan = $foldRight")

    //drop
    val drop = numbers2.drop(3)
    // drop right for last number clear, drop normal just in early number
    println(drop)

    //take
    val take = numbers2.take(3)
    // using take last for last number take
    println(take)
}