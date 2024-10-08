package problems.gold.g5

import java.io.BufferedReader
import java.io.InputStreamReader

private var parent = arrayOf<Int>()

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val sb = StringBuilder()
    parent = Array(n + 1) { it }

    for (i in 0 until m) {
        val (code, a, b) = readLine().split(" ").map { it.toInt() }

        when (code) {
            0 -> {
                union(a, b)
            }
            1 -> {
                sb.append("${if (find(a) == find(b)) "YES" else "NO"}\n")
            }
        }
    }

    println(sb)
}

private fun find(x: Int): Int {
    return if (x == parent[x]) x
    else {
        parent[x] = find(parent[x])
        parent[x]
    }
}

private fun union(a: Int, b: Int) {
    val na = find(a)
    val nb = find(b)

    if (na != nb) {
        parent[nb] = na
    }
}