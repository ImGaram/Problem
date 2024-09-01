package problems.bronze.b1

import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val num = readln().split(" ")
    val n = num[0].toInt()
    val k = num[1].toInt()

    bw.write("${factorial(n) / (factorial(k) * factorial(n-k))}")
    bw.flush()
    bw.close()
}

fun factorial(number: Int): Int {
    var total = 1
    for (i in 1 .. number) {
        total*=i
    }
    return total
}