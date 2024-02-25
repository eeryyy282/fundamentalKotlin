package speciallClassAndCollection// enumclass or enumeration

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN (0x00FF00),
    BLUE(0x0000FF)
}

fun main(){
    // array
    val colors: Array<Color> = Color.values()
    colors.forEach { color ->
        print("$color\n")
    }

    //values
    val newColor: Color = Color.valueOf("RED")
    println("Color is $newColor")
    println("Color is ${newColor.value.toString(16)}")
}
