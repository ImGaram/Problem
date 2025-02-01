package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, q) = bf.readLine().split(" ").map { it.toInt() }
    val a = StringTokenizer(bf.readLine())
    val prefixSum = Array(n + 1) { 0 }

    for (i in 1 .. n) {
        prefixSum[i] = prefixSum[i - 1] xor a.nextToken().toInt()
    }

    var answer = 0
    for (qi in 0 until q) {
        val (s, e) = bf.readLine().split(" ").map { it.toInt() }

        answer = answer xor (prefixSum[e] xor prefixSum[s - 1])
    }

    println(answer)
}