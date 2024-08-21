package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    for (i in 0 until case) {
        val clothesCnt = readLine().toInt()
        val clothes = mutableMapOf<String, MutableList<String>>()

        for (j in 0 until clothesCnt) {
            val (name, type) = readLine().split(" ")
            if (!clothes.containsKey(type)) clothes[type] = mutableListOf(name)
            else clothes[type]?.add(name)
        }

        var res = 1
        for (j in clothes.values) {
            // 옷을 안입는 경우를 고려해 + 1
            res *= (j.size + 1)
        }

        // 알몸인 상태를 제외해야 해서 - 1
        println(res - 1)
    }
}