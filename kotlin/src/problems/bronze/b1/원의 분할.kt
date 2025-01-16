package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (pab, pbc, pcd) = bf.readLine().split(" ").map { it.toDouble() }
    val answer = pab * pcd / pbc

    if (answer.toInt().toDouble() == answer) println(answer.toInt())
    else println(pab * pcd / pbc)
}