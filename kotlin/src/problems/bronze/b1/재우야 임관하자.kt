package problems.bronze.b1

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val subjects = listOf("swimming", "bowling", "soccer")
    val map = mutableMapOf<String, Int>()
    for (i in subjects.indices) {
        map[subjects[i]] = i
    }

    val dimension = readLine().toInt()
    for (i in 0 until dimension) {
        bw.append("${subjects[0]} ")
    }
    bw.append("\n")
    bw.flush()

    val st = StringTokenizer(readLine())
    for (i in 0 until dimension) {
        val fails = st.nextToken()
        val idx = if (map[fails] == 1) 2 else 1
        bw.append("${subjects[idx]} ")
    }

    bw.close()
}