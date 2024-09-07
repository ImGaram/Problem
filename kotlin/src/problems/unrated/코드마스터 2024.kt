package problems.unrated

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (computers, editor, install) = readLine().split(" ").map { it.toInt() }

    println(editor * install + editor)
}