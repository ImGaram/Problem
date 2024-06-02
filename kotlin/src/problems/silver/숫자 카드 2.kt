package src.problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    // 탐색은 해시맵 쓰는 게 list에서 찾는 거보다 훨씬 빠름.
    readLine()
    val haveList = readLine().split(" ")
    readLine()
    val checkHash = hashMapOf<String, Int>()
    val checkList = readLine().split(" ")

    for (i in checkList.indices) {
        checkHash[checkList[i]] = 0
    }

    for (i in haveList.indices) {
        if (checkHash.containsKey(haveList[i])) {
            checkHash[haveList[i]] = checkHash[haveList[i]]!! + 1
        }
    }

    val result = StringBuilder()
    for (i in checkList.indices) {
        result.append("${checkHash[checkList[i]]} ")
    }

    println(result)
}