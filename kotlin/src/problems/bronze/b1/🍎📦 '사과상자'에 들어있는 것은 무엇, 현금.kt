package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val fruitBoxCnt = readLine().toInt()

    var weight = 0          // 총 상자의 무게
    var boxInAppleCnt = 0   // 사과의 총 개수

    for (i in 0 until fruitBoxCnt) {
        val box = readLine().split(" ")
        val fruitKind = box[0]
        val width = box[1].toInt()
        val height = box[2].toInt()
        val length = box[3].toInt()

        // 12 * 12 * 12cm: 사과의 크기
        when(fruitKind) {
            "A" -> {
                val apples = (width / 12) * (height / 12) * (length / 12)
                boxInAppleCnt += apples
                weight += 1000 + (apples * 500)
            }
            "B" -> weight += 6000
        }
    }

    // 사과 1개: 4000원
    println(weight)
    println(boxInAppleCnt * 4000)
}