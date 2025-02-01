package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val t = bf.readLine().toInt()

    for (ti in 0 until t) {
        val (n, m) = bf.readLine().split(" ")
        var zero = 0
        var one = 0

        for (i in n.indices) {
            if (n[i] != m[i]) {
                if (m[i] == '1') one++
                else zero++
            }
        }

        println(max(one, zero))
    }
}