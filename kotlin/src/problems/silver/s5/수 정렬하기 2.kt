package problems.silver.s5

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    val inputStr = StringBuilder()

    repeat(case) {
        val num = readLine()
        if (case-1 == it) inputStr.append(num)
        else inputStr.append("$num,")
    }

    val list = inputStr.split(",").map { it.toInt() }
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    list.sorted().forEach {
        bw.write("$it\n")
    }
    bw.flush()
    bw.close()
}