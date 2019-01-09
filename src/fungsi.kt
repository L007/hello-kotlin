fun main(args: Array<String>) {
    helloWorld()
    println(perkalian(5,5))
    cetak(perkalian(100,10))
}

fun helloWorld(){
    println("helloWorld")
}

fun perkalian(num1:Int,num2: Int):Int{
    var hasil = num1*num2
    return hasil
}
fun cetak(num:Int){
    println(num)
}