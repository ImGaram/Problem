package problems.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val passwords = mutableMapOf<String, String>()
    val (sites, search) = readLine().split(" ").map { it.toInt() }

    for (i in 0 until sites) {
        val input = readLine().split(" ")
        passwords[input[0]] = input[1]
    }

    for (i in 0 until search) {
        val searchSite = readLine()
        bw.write("${passwords[searchSite]}\n")
    }

    bw.flush()
    bw.close()
}