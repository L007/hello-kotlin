open class Club{
    open fun namaClub(){

    }
}

class Madrid: Club() {
    override fun namaClub() {
        //super.namaClub()
        println("Real Madrid")
    }
}


class Juventus: Club() {
    override fun namaClub() {
        //super.namaClub()
        println("Juve")
    }
}

fun main(args: Array<String>) {
    val juve = Juventus()
    juve.namaClub()

    val madrid = Madrid()
    madrid.namaClub()
}