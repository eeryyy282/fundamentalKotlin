fun juzairiPhone(phoneName: StringBuilder.() -> Unit): String {
    val newPhoneName = StringBuilder()
    newPhoneName.phoneName()
    return newPhoneName.toString()
}

fun main() {
    val msgPhoneName = buildString {
        append("Samsung")
        append("Xiaomi")
        append("Iphone")
    }
    println(msgPhoneName)
}