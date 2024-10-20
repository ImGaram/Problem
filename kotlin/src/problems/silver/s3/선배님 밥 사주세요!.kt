package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val promise = mutableMapOf<String, List<Int>>()

    for (i in 0 until n) {
        val senior = bf.readLine().split(" ")
        promise[senior[0]] = senior.subList(1, senior.size).map { it.toInt() }
    }

    val rice = mutableListOf<List<Int>>()
    for (i in 0 until n) {
        val (s, m) = bf.readLine().split(" ")
        if (promise[s]!!.last() <= m.toInt()) {
            val addValue = listOf(promise[s]!![0], promise[s]!![1])
            if (!rice.contains(addValue)) rice.add(addValue)
        }
    }
    rice.sortBy { it.last() }
    rice.sortBy { it.first() }

    if (rice.isEmpty()) {
        println(0)
        return
    }

    var w = rice.first().first()
    var d = rice.first().last()
    var con = 1
    var answer = 0
    for (i in 1 until rice.size) {
        d++
        if (d == 7) {
            w++
            d = 0
        }

        if (rice[i] == listOf(w, d)) {
            con++
        } else {
            answer = max(con, answer)
            con = 1
            w = rice[i].first()
            d = rice[i].last()
        }
    }

    println(max(con, answer))
}