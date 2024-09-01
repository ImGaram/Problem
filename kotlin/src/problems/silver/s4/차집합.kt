package problems.silver.s4

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.Stack

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val list = bf.readLine().split(" ")

    val listA = set(list[0].toInt(), bf)
    val listB = set(list[1].toInt(), bf)

    val result = listA.subtract(listB.toSet()).toList()
    val resultSize = result.size
    if (listA.subtract(listB.toSet()).isEmpty()) {
        bw.write(resultSize.toString())
    } else {
        bw.write(resultSize.toString()+"\n")

        // 증가하는 순서로 출력하기
        changeListType(result).sorted().forEach { i ->
            bw.write("$i ")
        }
    }

    bf.close()
    bw.flush()
    bw.close()
}

fun set(item: Int, bf: BufferedReader): MutableList<String> {
    var tempList = MutableList<String>(item) { "0" }
    tempList = bf.readLine().split(" ").toMutableList()

    return tempList
}

fun changeListType(result: List<String>): List<Int> {
    val intStack = Stack<Int>()
    for (i in result.indices) intStack.push(result[i].toInt())

    return intStack.toList()
}