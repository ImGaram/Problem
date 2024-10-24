package problems.bronze.b2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, k) = bf.readLine().split(" ")
    var answer = 0

    for (h in 0 .. n.toInt()) {
        for (m in 0 .. 59) {
            for (s in 0 .. 59) {
                 if (parsingTime(h).contains(k) || parsingTime(m).contains(k) || parsingTime(s).contains(k)) {
                     answer++
                 }
            }
        }
    }

    println(answer)
}

private fun parsingTime(n: Int): String {
    return if (n < 10) "0$n"
    else n.toString()
}