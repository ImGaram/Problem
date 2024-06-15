package problems.gold

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val testCase = readLine().toInt()

    for (c in 0 until testCase) {
        val commandCnt = readLine().toInt()
        val treemap = TreeMap<Int, Int>()

        for (i in 0 until commandCnt) {
            val (function, number) = readLine().split(" ")

            when (function) {
                "I" -> {
                    if (treemap.containsKey(number.toInt())) treemap[number.toInt()] = treemap[number.toInt()]!! + 1
                    else treemap[number.toInt()] = 1
                }
                "D" -> {
                    if (treemap.isNotEmpty()) {
                        if (number == "1") {
                            if (treemap[treemap.lastKey()] == 1) treemap.remove(treemap.lastKey())
                            else treemap[treemap.lastKey()] = treemap[treemap.lastKey()]!! - 1
                        } else {
                            if (treemap[treemap.firstKey()] == 1) treemap.remove(treemap.firstKey())
                            else treemap[treemap.firstKey()] = treemap[treemap.firstKey()]!! - 1
                        }
                    }
                }
            }
        }

        if (treemap.isEmpty()) bw.write("EMPTY\n")
        else bw.write("${treemap.lastKey()} ${treemap.firstKey()}\n")
    }

    bw.flush()
    bw.close()
}