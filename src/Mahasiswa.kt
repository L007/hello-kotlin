data class Mahasiswa(var nama:String,val nim:String)

fun main(args: Array<String>) {
    val mhs1 = Mahasiswa("eldi","152410101090")

    println(mhs1.nama)
    mhs1.nama="eldianto"


    println ("nama saya : ${mhs1.nama} dengan nim : ${mhs1.nim}")
    println (mhs1.hashCode())

}