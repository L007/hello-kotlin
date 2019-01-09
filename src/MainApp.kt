import com.sun.xml.internal.fastinfoset.util.StringArray
import java.util.*

fun main(args:Array<String>){
    println("hello world")
    val input = Scanner(System.`in`)



   /* var nama : String = "hehe"
    val usia : Int

    nama = "eldi"
    usia = 31

    println(nama+" dan usia "+usia)
    println("nama saya adalah $nama umur saya adalah ${usia-10} ")

    for (i in 1..10){
        println("loop ke $i")
    }

    //val hari = listOf("senin","selasa","rabu","kamis","jum'at","sabtu","minggu")
    for (hari1 in hari){
        println(hari1)
    }
*/

    /*val mahasiswa = Array(5,{i-> readLine()})

    for (i in 1..3){
        //mahasiswa[i]= readLine()

        *//*for (j in 1..3){
            mahasiswa[i][j] = "abc"
        }*//*
    }
    for (maha in mahasiswa){
       println(maha)
    }*/

    var MatrixA = Array(3,{IntArray(4)})
    //val MatrixB = Array<Array<String>>()
    var MatrixC =  Array(2) {Array(3) {""}}
    var MatrixD =  Array(2){Array(5) {Array(3) {""}}

    var num = 10
    for (i in 0..MatrixC.size-1){
        for (j in 0..MatrixC[i].size-1){
            print("masukkan huruf : ")
            MatrixC[i][j] = input.next()
        }

    }
    for (i in 0..MatrixC.size-1){
        for (j in 0..MatrixC[i].size-1){

            print(""+MatrixC[i][j]+" ")
        }
        println()
    }

//    for (i in 0..2){
//        MatrixA.set(i, readLine())
//        for (j in 0..2){
//            MatrixA[i][j]
//        }
//    }


}
}