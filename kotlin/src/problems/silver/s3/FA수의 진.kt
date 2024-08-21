package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val cross = readLine().toInt()
    var time = 0

    for (i in 0 until cross) {
        val (crosswalk, viaduct, green, red) = readLine().split(" ").map { it.toInt() }

        val crossingTime = if (time % (green + red) < green) {
            0
        } else {
            // 나머지가 0이 되야 출발할 수 있다.
            (green + red) - time % (green + red)
        }

        time += min(crossingTime + crosswalk, viaduct)
    }

    println(time)
}