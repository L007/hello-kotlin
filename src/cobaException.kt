fun main(args: Array<String>) {

    try {
        val hasil = 2/0
        println(hasil)
    }
    catch (e:Throwable){
        println(e.message)
    }

    print(pembagian(2,0))

}

class CustomException(pesan:String):Exception(pesan)

fun pembagian(num1:Int,num2: Int){

    if (num2==0){
        throw CustomException("tidak boleh dibagi 0!!")
    }
    else{
        val result = num1/num2
        println(result)
    }

}
