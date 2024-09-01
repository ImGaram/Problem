package problems.bronze.b3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    val sequence = readLine().split(" ").map { it.toInt() }

    val evens = sequence.filter { it % 2 == 0 }.toMutableList()
    val odds = sequence.filter { it % 2 != 0 }.toMutableList()
    val arr = Array(case) { 0 }

    evens.sort()
    odds.sort()

    var result = 1
    for (i in arr.indices) {
        if (i % 2 == 0) {
            if (odds.isNotEmpty()) {
                arr[i] = odds.first()
                odds.removeFirst()
            } else {
                result = 0
                break
            }
        } else {
            if (evens.isNotEmpty()) {
                arr[i] = evens.first()
                evens.removeFirst()
            } else {
                result = 0
                break
            }
        }
    }

    println(result)
}