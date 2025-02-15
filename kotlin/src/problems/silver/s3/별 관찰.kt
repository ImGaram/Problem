package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val shineStar1 = bf.readLine().timeToInt()
    val shineStar2 = bf.readLine().timeToInt()
    val shineRotate1 = bf.readLine().timeToInt()
    val shineRotate2 = bf.readLine().timeToInt()
    val day = listOf("Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday")
    val hs = hashSetOf<Int>()

    var i = 0
    while (true) {
        var cur = shineStar1 + shineRotate1 * i++
        if (cur - shineStar2 < 0) continue

        val temp = (cur - shineStar2) % shineRotate2
        if (hs.contains(temp)) break
        hs.add(temp)

        if (temp != 0) continue

        val min = cur % 60
        cur /= 60
        val hour = cur % 24
        cur /= 24

        println(day[cur % 7])
        println("${lpad(hour)}:${lpad(min)}")
        return
    }
    println("Never")
}

private fun lpad(n: Int): String {
    return if (n < 10) "0$n"
    else n.toString()
}

private fun String.timeToInt(): Int {
    val h = split(":").first().toInt()
    val m = split(":").last().toInt()

    return h * 60 + m
}