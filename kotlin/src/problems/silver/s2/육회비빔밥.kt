package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

private var list = arrayOf<Int>()
private var result = arrayOf<Int>()
private var visited = booleanArrayOf()
private var a = listOf<Int>()
private var b = listOf<Int>()
private var c = listOf<Int>()
private var answer = -1

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, k) = bf.readLine().split(" ").map { it.toInt() }
    a = bf.readLine().split(" ").map { it.toInt() }
    b = bf.readLine().split(" ").map { it.toInt() }
    c = bf.readLine().split(" ").map { it.toInt() }

    list = (0 until n).toList().toTypedArray()
    result = Array(n) { 0 }
    visited = BooleanArray(n)

    permutation(n, k)
    println(answer)
}

private fun permutation(n: Int, k: Int, depth: Int = 0) {
    if (depth == n) {
        var sum = 0
        var isBreak = false

        for (i in result.indices) {
            if (i > 0) {
                sum += a[result[i - 1]] * b[result[i]]

                if (k < c[result[i - 1]] * c[result[i]]) {
                    isBreak = true
                    break
                }
            }
        }

        if (!isBreak) answer = max(answer, sum)
        return
    }

    for (i in list.indices) {
        if (visited[i]) continue

        result[depth] = list[i]
        visited[i] = true
        permutation(n, k, depth + 1)
        visited[i] = false
    }
}