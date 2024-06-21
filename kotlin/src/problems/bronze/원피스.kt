package problems.bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val code = readLine()
    val check = readLine()

    var index = 0
    var same = 0
    while (index < code.length) {
        if (code[index] == check[0] && code.length-index >= check.length) {
            val subCode = code.substring(index, index+check.length)
            if (subCode == check) {
                index += check.length
                same++
                continue
            }
        }
        index++
    }

    println(same)
}