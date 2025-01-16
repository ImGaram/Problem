package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val stuNums = mutableListOf<String>()
    var size = 0

    for (i in 0 until n) {
        val num = bf.readLine()

        size = num.length
        stuNums.add(num)
    }

    for (c in 1 .. size) {
        val subs = mutableListOf<String>()

        for (i in stuNums.indices) {
            val subNum = stuNums[i].substring(size - c, size)

            if (!subs.contains(subNum)) subs.add(subNum)
            else break
        }

        if (subs.size == n) {
            println(c)
            break
        }
    }
}