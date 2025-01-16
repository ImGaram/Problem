package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val key = bf.readLine().mapIndexed { index, c -> Pair(index, c.toString()) }.toMutableList()
    val code = bf.readLine()
    val parse = Array(key.size) { "" }
    val parseStrLength = code.length / key.size
    key.sortBy { it.second }

    for (i in code.indices) {
        parse[i / parseStrLength] += code[i].toString()
    }

    val res = mutableMapOf<Int, String>()
    for (i in parse.indices) {
        res[key[i].first] = parse[i]
    }

    val answer = StringBuilder()
    for (vi in 0 until res[0]!!.length) {
        for (ki in 0 until key.size) {
            answer.append(res[ki]!![vi])
        }
    }

    println(answer)
}