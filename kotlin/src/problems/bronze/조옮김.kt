package problems.bronze

import java.io.BufferedReader
import java.io.InputStreamReader

private val musicalScales = listOf("A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#")

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    while (true) {
        var result = ""
        val input = readLine().split(" ")
        if (input[0] == "***") break
        val move = readLine().toInt()

        for (i in input.indices) {
            val scale = input[i]
            val scaleIndex = changeSameMusicalScalesIndex(scale)

            val resIndex = scaleIndex + move % 12
            if (move > 0) {
                if (resIndex >= musicalScales.size) {
                    val overFlowIndex = resIndex - musicalScales.lastIndex - 1
                    result += "${musicalScales[overFlowIndex]} "
                } else result += "${musicalScales[resIndex]} "
            } else {
                if (resIndex < 0) {
                    val overFlowIndex = resIndex + musicalScales.lastIndex + 1
                    result += "${musicalScales[overFlowIndex]} "
                } else result += "${musicalScales[resIndex]} "
            }
        }

        println(result)
    }
}

private fun changeSameMusicalScalesIndex(scale: String): Int {
    // Db == C#
    // B# == C
    val search = musicalScales.indexOf(scale)
    return if (search != -1) {
        search
    } else {
        val scaleFirst = scale.first().toString()
        val scaleFirstIndex = musicalScales.indexOf(scaleFirst)

        val sameScale = if (scale.last() == 'b') {
            if (scaleFirstIndex == 0) musicalScales.lastIndex
            else scaleFirstIndex - 1
        } else scaleFirstIndex + 1

        sameScale
    }
}