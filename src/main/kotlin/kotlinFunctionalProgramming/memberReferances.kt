//member references

val sum: (Int, Int) -> Int = ::count
fun count(valueA: Int, valueB: Int): Int {
    return valueA + valueB
}
fun Int.isEvenNUmber() = this % 2 == 0
fun main() {
    val numbers = 1..10
    val evenNumbers = numbers.filter(Int::isEvenNumber)
    println(evenNumbers)
}

fun Int.isEvenNumber() = this % 2 == 0