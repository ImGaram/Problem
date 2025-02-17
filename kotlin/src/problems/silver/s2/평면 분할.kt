package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()

    var answer = 2
    var addValue = 2
    var added = false
    for (i in 2 .. n) {
        answer += addValue

        if (added) {
            added = false
            addValue++
            continue
        }
        if (addValue % 2 == 1) {
            added = true
            continue
        }
        addValue++
    }

    println(answer)
}