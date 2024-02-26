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

    //scope function with lambda receiver
    //run
    val hobby = "Swim"
    val newHobby = hobby.run {
        val from = this
        val to = this.replace("Swim", "Badminton")
        "replace text form $from to $to"
    }
    println("new hobby: $newHobby")

    //with
    val newHooby2 = with (newHobby) {
        println("Value is $this")
        println("length of the text is ${this.length}")
    }

    //apply
    val builder = StringBuilder()
    builder.append("Hello ")
    builder.append("Kotlin")

    println(builder.toString())
}