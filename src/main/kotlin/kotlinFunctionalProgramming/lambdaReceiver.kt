fun juzairiPhone(phoneName: StringBuilder.() -> Unit): String {
    val newPhoneName = StringBuilder()
    newPhoneName.phoneName()
    return newPhoneName.toString()
}

fun main() {
    //output lambda receiver
    val msgPhoneName = buildString {
        append("Samsung")
        append("Xiaomi")
        append("Iphone")
    }
    println(msgPhoneName)

    //lambda receiver (this) apply
    val buildString = StringBuilder().apply {
        append("Hello")
        append("Kotlin")
    }
    println(buildString)

    //lambda argument (it)
    val text = "Hello"
    text.let {value ->
        val msgText = "$value Kotlin"
        println(msgText)
    }

}