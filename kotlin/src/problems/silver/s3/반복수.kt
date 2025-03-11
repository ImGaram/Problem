package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (a, b, k, m) = bf.readLine().split(" ").map { it.toLong() }
    val s = 10.0.pow((k - 1).toInt()).toLong()
    val e = 10.0.pow(k.toInt()).toLong()
    var ans = 0

    for (n in s until e) {
        var str = n.toString()
        var l = k.toInt()

        while (true) {
            while (l > str.length) {
                str += n
            }

            val ns = str.substring(0, l).toLong()
            if (ns > b) break
            if (ns >= a && ns % m == 0L) {
               ans++
            }
            l++
            if (l > b.toString().length) break
        }
    }

    println(ans)
}