package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader

private val duplicateStr = mutableMapOf<String, Boolean>()

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val x = bf.readLine().map { it.toString() }
    val y = bf.readLine().map { it.toString() }
    val z = bf.readLine().map { it.toString() }
    val k = bf.readLine().toInt()

    combination(x, 0, k, 0)
    combination(y, 0, k, 0)
    combination(z, 0, k, 0)

    val filterTrue = duplicateStr.filter { it.value }
    val trueKeys = filterTrue.map { it.key }
    val answer = trueKeys.sorted().joinToString("\n")

    if (answer.isEmpty()) println(-1)
    else println(answer)
}

private val res = mutableListOf<String>()

private fun combination(l: List<String>, index: Int, k: Int, d: Int) {
    if (k == d) {
        val result = res.joinToString("")
        duplicateStr[result] = duplicateStr.containsKey(result)

        return
    }

    for (i in index until l.size) {
        res.add(l[i])
        combination(l, i + 1, k, d + 1)
        res.removeAt(res.lastIndex)
    }
}
