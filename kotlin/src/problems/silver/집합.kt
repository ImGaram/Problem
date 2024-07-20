package problems.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var set = mutableSetOf<Int>()
    val calculationCnt = readLine().toInt()

    for (i in 0 until calculationCnt) {
        val calculation = readLine().split(" ")
        val number = if (calculation[0] != "all" && calculation[0] != "empty") calculation[1].toInt()
        else 0

        when (calculation[0]) {
            "add" -> set.add(number)
            "remove" -> set.remove(number)
            "check" -> {
                if (set.contains(number)) bw.write("1\n")
                else bw.write("0\n")
            }
            "toggle" -> {
                if (set.contains(number)) set.remove(number)
                else set.add(number)
            }
            "all" -> set = (1..20).toMutableSet()
            "empty" -> set.clear()
        }
    }

    bw.flush()
    bw.close()
}