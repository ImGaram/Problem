package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    while (true) {
        var result = ""
        var startIndex = -1
        val data = readLine() ?: break
        val (str, delStr) = data.split(" ")

        for (c in str) {
            var saveIndex = -1

            // 찾은 마지막 자리수를 제외시키고 검색해야 함.
            for (i in startIndex + 1 until delStr.length) {
                if (c == delStr[i]) {
                    saveIndex = i
                    break
                }
            }

            if (saveIndex == -1) {
                result = "No"
                break
            }
            startIndex = saveIndex
        }

        if (result.isEmpty()) println("Yes")
        else println(result)
    }
}