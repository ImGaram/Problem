package src.problems.silver

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val case = nextInt()
    val words = mutableListOf<String>()

    repeat(case) {
        val word = next()
        if (!words.contains(word)) words.add(word)
    }

    // 사전순 정렬
    val sortDictionary = words.sorted()
    // string 길이순으로 정렬
    val sortLength = sortDictionary.sortedBy { it.length }
    sortLength.forEach {
        println(it)
    }
}