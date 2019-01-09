open class Kendaraan(){

}


class Motor : Kendaraan() {
    fun klakson() {
        println("tin tin")
    }
}

class Truk : Kendaraan(){
    fun klakson() {
        println("hooong hooong")
    }
}




fun main(args: Array<String>) {



 fun cekKlakson(kendaraan: Kendaraan) {
    if (kendaraan is Motor){
        kendaraan as Motor
        kendaraan.klakson()
    }
     else if(kendaraan is Truk){
        kendaraan as Truk
        kendaraan.klakson()
    }
 }
    cekKlakson(Truk())
}

