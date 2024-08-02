package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val cellPhoneCnt = readLine().toInt()
    val calling = mutableListOf(0)
    val phone = readLine().split(" ").map { it.toInt() }
    var changeCnt = 0

    calling.addAll(phone)
    for (i in 1 .. cellPhoneCnt) {
        if (i == calling[i]) {
            val toChange = if (i == cellPhoneCnt) 1 else cellPhoneCnt
            calling[i] = toChange
            changeCnt++
        }
    }

    println(changeCnt)
    println(calling.filter { it != 0 }.joinToString(" "))
}