package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    // n: round, x: 초기 레이팅, m: 쿼리의 개수, k: 낮은 레이팅 기준점
    val (n, m, k, x) = bf.readLine().split(" ").map { it.toInt() }
    val a = StringTokenizer(bf.readLine())
    val rating = Array(n + 1) { 0 }
    var score = x
    rating[0] = if (score < k) 1 else 0

    for (i in 1 until rating.size) {
        score += a.nextToken().toInt()
        rating[i] = if (score < k) rating[i - 1] + 1 else rating[i - 1]
    }

    val answer = StringBuilder()
    for (i in 0 until m) {
        val (l, r) = bf.readLine().split(" ").map { it.toInt() }

        answer.append("${rating[r - 1] - rating[l - 1]}\n")
    }

    println(answer)
}