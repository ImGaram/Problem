package problems.bronze.b2

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (apple, banana) = readLine().split(" ").map { it.toInt() }

    for (f in 1 .. min(apple, banana)) {
        if (apple % f == 0 && banana % f == 0) {
            println("$f ${apple / f} ${banana / f}")
        }
    }
}