//regular function
fun getMassage(name: String): String {
    return "Hello $name"
}

//lambda
val massage: (String) -> String = {name : String ->
    "Hello $name"
}

//lambda expression
val email = { println("airiagustus82@gmail.com")}
//with parameter
val printEmail = {valueEmail: String -> println(valueEmail) }




fun main() {
  /*  println(getMassage("Juzairi Regular"))
    println(massage("Lambda Function"))
    email()
    printEmail("Hello lambda with parameter") */

    val ranges = 1..10 step 3
    ranges.forEach { value ->
        println("Value is $value")
    }
}