package problems.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (pokeCnt, case) = readLine().split(" ").map { it.toInt() }
    val dictionaryName = mutableMapOf<Int, String>()
    val dictionaryNumber = mutableMapOf<String, Int>()

    for (i in 1 .. pokeCnt) {
        val pokeName = readLine()
        dictionaryName[i] = pokeName
        dictionaryNumber[pokeName] = i
    }

    for (i in 0 until case) {
        val searchValue = readLine()

        runCatching {
            bw.write("${dictionaryName[searchValue.toInt()]}\n")
        }.onFailure {
            bw.write("${dictionaryNumber[searchValue]}\n")
        }
    }

    bw.flush()
    bw.close()
}