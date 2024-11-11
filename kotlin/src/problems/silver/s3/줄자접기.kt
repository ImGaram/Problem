package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader
import java.text.DecimalFormat
import kotlin.math.max

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    var length = bf.readLine().toDouble()
    val rby = mutableListOf<Array<Double>>()

    for (i in 0 until 3) {
        val col = bf.readLine().split(" ").map { it.toDouble() }.toTypedArray()
        col.sort()
        rby.add(col)
    }

    for (i in 0 until rby.size) {
        val currentCol = rby[i]
        if (currentCol[0] == currentCol[1]) continue

        val cutting = (currentCol[0] + currentCol[1]) / 2
        length = max(cutting, length - cutting)

        for (j in i until rby.size) {
            val left = rby[j][0]
            val right = rby[j][1]

            if (left < cutting) rby[j][0] = left + (cutting - left) * 2 - cutting
            else rby[j][0] -= cutting

            if (right < cutting) rby[j][1] = right + (cutting - right) * 2 - cutting
            else rby[j][1] -= cutting
        }
    }

    val decimalFormat = DecimalFormat("#.0")
    println(decimalFormat.format(length))
}