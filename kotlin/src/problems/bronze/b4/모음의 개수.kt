package problems.bronze.b4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val string = readLine()
    val vowels = listOf('a', 'e', 'i', 'o', 'u')

    var answer = 0
    for (str in string) {
        if (vowels.contains(str)) answer++
    }

    println(answer)
}