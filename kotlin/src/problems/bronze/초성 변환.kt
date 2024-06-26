package problems.bronze

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val str = next()
    val hangul = listOf("ㄱ","ㄲ","ㄴ","ㄷ","ㄸ","ㄹ","ㅁ","ㅂ","ㅃ","ㅅ","ㅆ","ㅇ","ㅈ","ㅉ","ㅊ","ㅋ","ㅌ","ㅍ","ㅎ")

    for (i in str.indices) {
        val han = (str[i] - 0xAC00).code / 28 / 21
        print(hangul[han])
    }
}