package problems.silver

import java.util.*
import kotlin.math.ceil

fun main() = with(Scanner(System.`in`)) {
    val roomNumber = next().map { it.digitToInt() }.toMutableList()
    val usePlasticNumCnt = Array(10) { 0 }

    for (i in roomNumber) {
        // 9인 경우 6으로 통합시키기.
        if (i == 9) usePlasticNumCnt[6]++
        else usePlasticNumCnt[i]++
    }

    // 6과 9는 한 세트이기 때문에 2로 나눈 값을 올림(데이터가 3인 경우에는 세트가 2개가 필요하기 때문).
    usePlasticNumCnt[6] = ceil(usePlasticNumCnt[6] / 2.0).toInt()
    println(usePlasticNumCnt.max())
}