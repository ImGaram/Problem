package problems.bronze.b3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = bf.readLine().split(" ").map { it.toInt() }
    val a = bf.readLine().split(" ").map { it.toInt() }

    var stress = 0
    var answer = 0
    for (s in a) {
        stress += s

        if (stress < 0) stress = 0
        if (stress >= m) answer++
    }

    println(answer)
}