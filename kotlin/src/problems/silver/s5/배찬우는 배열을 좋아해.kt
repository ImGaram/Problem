package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, m, q) = bf.readLine().split(" ").map { it.toInt() }
    val array = Array(n) { arrayOf<Int>() }

    for (i in 0 until n) {
        val arr = bf.readLine().split(" ").map { it.toInt() }.toTypedArray()
        array[i] = arr
    }

    for (i in 0 until q) {
        val query = bf.readLine().split(" ").map { it.toInt() }
        val qi = query[1]
        val qj = query[2]

        when (query[0]) {
            0 -> { array[qi][qj] = query[3] }
            1 -> {
                val temp = array[qi]
                array[qi] = array[qj]
                array[qj] = temp
            }
        }
    }

    for (i in array.indices) {
        println(array[i].joinToString(" "))
    }
}