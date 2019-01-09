
abstract class Kampus(val tipeKampus:String){
    var nama : String=""
    abstract fun setNamaKampus(nama:String)

    fun getKampusTipe():String{
        return tipeKampus
    }
}

class Unej : Kampus("Universitas"){
    override fun setNamaKampus(nama: String) {
        this.nama=nama
    }

}

fun main(args: Array<String>) {
    val unej = Unej()
    unej.setNamaKampus("Universitas Jember")

    println("nama kampus adalah ${unej.nama} dan tipe kampus ${unej.getKampusTipe()}")
}