package src.problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader

// 같은 단어가 연속해서 나타나야 한다.
// 이미 나타난 단어가 또 나타나면 안된다.
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    var groupWord = 0

    repeat(case) {
        val word = readLine()
        val wordCntMap = mutableMapOf<Char, Int>()
        var isWordGrouped = true

        for (i in word.indices) {
            if (!wordCntMap.contains(word[i])) {
                wordCntMap[word[i]] = i
            } else {
                if (i - wordCntMap[word[i]]!! > 1) {
                    isWordGrouped = false
                    break
                }
                wordCntMap[word[i]] = i
            }
        }

        if (isWordGrouped) groupWord++
    }

    println(groupWord)
}