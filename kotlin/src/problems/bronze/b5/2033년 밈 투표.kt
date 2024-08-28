package problems.bronze.b5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val promise = listOf(
        "Never gonna give you up",
        "Never gonna let you down",
        "Never gonna run around and desert you",
        "Never gonna make you cry",
        "Never gonna say goodbye",
        "Never gonna tell a lie and hurt you",
        "Never gonna stop"
    )

    val sentenceList = mutableListOf<String>()
    val case = readLine().toInt()

    for (i in 0 until case) {
        sentenceList.add(readLine())
    }

    var res = "No"
    for (i in 0 until sentenceList.size) {
        if (!promise.contains(sentenceList[i])) {
            res = "Yes"
            break
        }
    }

    println(res)
}