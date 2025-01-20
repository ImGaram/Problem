package problems.gold.g5

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val potion = bf.readLine().split(" ").map { it.toInt() }.toTypedArray()
    potion.sort()

    var minMix = Int.MAX_VALUE
    var answer = ""

    var s = 0
    var e = potion.lastIndex
    while (s != e) {
        val mix = potion[s] + potion[e]

        if (abs(mix) < minMix) {
            minMix = abs(mix)
            answer = "${potion[s]} ${potion[e]}"
        }

        if (mix > 0) e--
        else if (mix < 0) s++
        else {
            answer = "${potion[s]} ${potion[e]}"
            break
        }
    }

    println(answer)
}