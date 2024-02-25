// singleton object
object JuzairiPhone {
    var user: String= "Airi"

    fun phoneNameById(id: Int) {
        print("Phone with $id has named by $user")
    }
}

// companion object
class NoOnePhone {
    companion object {
        fun phoneColorById(id: Int) {
            println("Color phone with $id has been clear")
        }
    }
}

//anonymus class
interface Ifly {
    fun fly()
}
fun flyWithWings(bird: Ifly) {
    bird.fly()
}

//single abstract method

fun interface ISwim{
    fun swim()
}

fun swimWithHand(human: ISwim) {
    human.swim()
}

fun main() {
//    JuzairiPhone.phoneNameById(32)
//    NoOnePhone.phoneColorById(22)
    //anonymus class main run
    flyWithWings(object: Ifly {
        override fun fly() {
            println("The bird was flying")
        }
    })

    //SAM conversion
    swimWithHand{
        println("Human can swim with him hand")
    }
}