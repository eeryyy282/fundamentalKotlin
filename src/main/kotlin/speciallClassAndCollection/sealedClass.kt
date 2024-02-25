
sealed class Result {
    sealed class Succes(val data: Any): Result()
    data class Error(val massage: String): Result()
    object Loading: Result()
}

fun main() {
    val result: Result = Result.Error("Oops!")
    when (result) {
        is Result.Succes -> {
            println("Succes: ${result.data}")
        }
        is Result.Error -> {
            println("Error : ${result.massage}")
        }
        is Result.Loading -> {
            println("Loading..")
        }
        else -> {
            println("Nothing meet the condition")
        }
    }
}