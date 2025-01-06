package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val t = bf.readLine().toInt()

    for (i in 0 until t) {
        val n = bf.readLine().toInt()
        var a = 1
        var answer = 0

        while (a <= n / a) {
            if (n % a == 0) {
                val b = n / a

                if (gcd(a, b) == 1) answer++
            }
            a++
        }

        println(answer)
    }
}

private fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a
    else gcd(b, a % b)
}