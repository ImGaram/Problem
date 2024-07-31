package problems.bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val weeks = readLine().toInt()
    val worker = mutableMapOf<String, Int>()
    val hour = listOf(10, 4, 6, 4)

    for (i in 1 .. weeks * 4) {
        val week = readLine().split(" ")

        for (j in week.indices) {
            if (week[j] == "-") continue
            else {
                if (!worker.containsKey(week[j])) {
                    worker[week[j]] = hour[i % 4]
                } else {
                    worker[week[j]] = worker[week[j]]!! + hour[i % 4]
                }
            }
        }
    }

    if (worker.isEmpty()) {
        println("Yes")
        return
    }

    val maxWork = worker.values.max()
    val minWork = worker.values.min()

    if (maxWork - minWork > 12) println("No")
    else println("Yes")
}