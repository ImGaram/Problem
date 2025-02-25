package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = bf.readLine().split(" ").map { it.toInt() }
    var answer = 0

    var minPack = Int.MAX_VALUE
    var minPiece = Int.MAX_VALUE
    for (mi in 0 until m) {
        val (pack, piece) = bf.readLine().split(" ").map { it.toInt() }

        minPack = min(minPack, pack)
        minPiece = min(minPiece, piece)
    }

    if (minPiece * 6 <= minPack) {
        answer = minPiece * n
    } else {
        answer = (n / 6) * minPack
        if (n % 6 * minPiece <= minPack) {
            answer += (n % 6) * minPiece
        } else {
            answer += minPack
        }
    }

    println(answer)
}