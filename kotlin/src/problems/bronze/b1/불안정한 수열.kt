package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    readLine().toInt()
    val list = readLine().split(" ").map { it.toInt() }.toTypedArray()

    var unstableCnt = 0
    if (list.size == 1) println(1)
    else {
        for (i in 0 until list.size - 1) {
            if ((list[i] + list[i+1]) % 2 == 0) list[i] = 0
        }

        for (i in list.indices) {
            if (list[i] != 0) unstableCnt++
        }

        println(unstableCnt)
    }
}