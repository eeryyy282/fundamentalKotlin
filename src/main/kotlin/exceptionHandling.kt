import java.lang.NullPointerException

fun main(){
    val valueString: String? = null
    var valueInt: Int? = null

    try {
        valueInt = valueString!!.toInt()
    }
    catch (e: NullPointerException) {
        valueInt = 0
    }
    catch (e: NullPointerException) {
        valueInt = -1
    }
    finally {
        when(valueInt) {
            0 -> println("Catch block berhasil terpanggil")
            -1 -> println("Catch block juga ikut terapggil")
            else -> println(valueInt)
        }
    }
}