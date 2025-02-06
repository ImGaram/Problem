package problems.bronze.b2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    var res = Pair<List<Int>, Int>(emptyList(), Int.MAX_VALUE)

    for (a in 1 .. n) {
        for (b in 1 .. n) {
            if (a * b > n) break

            for (c in 1 .. n) {
                if (a * b * c >  n) break

                if (a * b * c == n) {
                    val surfaceArea = (a * b + b * c + c * a) * 2
                    if (res.second > surfaceArea) {
                        res = Pair(listOf(a, b, c), surfaceArea)
                    }
                }
            }
        }
    }

    println(res.first.joinToString(" "))
}