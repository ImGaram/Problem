package src.problems.silver

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val input = nextLine()
    val line = input.split(" ")[0].toInt()
    val num = input.split(" ")[1].toInt()
    val pascalTriangle = MutableList(line) { MutableList(line) { 0 } }

    pascalTriangle[0][0] = 1
    for (i in 1 until line) {
        pascalTriangle[i][0] = 1
        pascalTriangle[i][i] = 1

        for (j in 1 until i) {
            pascalTriangle[i][j] = pascalTriangle[i-1][j] + pascalTriangle[i-1][j-1]
        }
    }

    for (i in pascalTriangle.indices) {
        for (j in pascalTriangle[i].indices) {
            print("${pascalTriangle[i][j]} ")
        }
        println()
    }

    println(pascalTriangle[line-1][num-1])
}