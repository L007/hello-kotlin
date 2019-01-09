fun main(args: Array<String>) {
    val pajero = Pajero()
    println("tipe mobil : ${pajero.getTipe()}\nharga : ${pajero.getHarga()}")
}

interface Mobil{
    fun getTipe():String
    fun getHarga():String
}

class Pajero : Mobil{
    override fun getTipe():String {
        return "Mobil sport"
    }

    override fun getHarga():String {
        return "Rp 500.000.000"
    }

}