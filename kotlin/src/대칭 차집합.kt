import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Scanner

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val sc = Scanner(System.`in`)

    val listItemSize = bf.readLine().split(" ")

    val list1 = setList(listItemSize[0].toInt(), bf)
    val list2 = setList(listItemSize[1].toInt(), bf)

    val listSubtract1 = list1.subtract(list2.toSet()).size
    val listSubtract2 = list2.subtract(list1.toSet()).size

    println(listSubtract1+listSubtract2)
}

fun setList(item: Int, bf: BufferedReader): MutableList<String> {
    var tempList = MutableList<String>(item) { "0" }
    tempList = bf.readLine().split(" ").toMutableList()

    return tempList
}