fun main(args: Array<String>) {
    val random: MutableList<Int> = mutableListOf()
    for (i in 1..5) {
        val x = (1..1000).shuffled().first()
        random.add(x)
    }
    random.forEach { random -> println(random) }

    val pow = { num1: Int, num2: Int ->
        var hasil:Int=1
        for (i in 1..num2) {
             hasil= hasil*num1
        }
        println(hasil)
    }
    pow(3,5)


    val listMahasiswa : MutableList<String> = mutableListOf()
    listMahasiswa.add("eldi")
    listMahasiswa.add("antoeldi")
    listMahasiswa.add("hehe")

    val filter = {listMahasiswa.filter { it.length==4 }}
    // it sama argumen yang kita pass ke lambda func jadi tidak perlu misal s -> s.length

    println(filter( ))



}