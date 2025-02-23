package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().split(" ").map { it.toInt() }.toMutableList()
    val sum = bf.readLine().toInt()
    val res: MutableList<List<Int>> = mutableListOf()
    val sb = StringBuilder()

    n.sort()
    for (i in n.indices) {
        for (p in i + 1 until n.size) {
            if (n[i] + n[p] == sum) {
                val addValue = listOf(n[i], n[p])
                var isBreak = false

                for (ri in res.indices) {
                    if (res[ri].containsAll(addValue)) {
                        isBreak = true
                        break
                    }
                }

                if (!isBreak) {
                    sb.append("${addValue.joinToString(" ")}\n")
                    res.add(addValue)
                }
            }
        }
    }
    sb.append(res.size)

    println(sb)
}