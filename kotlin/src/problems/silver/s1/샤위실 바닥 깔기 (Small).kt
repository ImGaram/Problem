package problems.silver.s1

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.pow

private var map = arrayOf(arrayOf<Int>())
private var cur = 0

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val k = bf.readLine().toInt()
    val (x, y) = bf.readLine().split(" ").map { it.toInt() }

    val size = 2.0.pow(k).toInt()
    map = Array(size + 1) { Array(size + 1) { 0 } }
    map[size - y + 1][x] = -1
    tromino(size, 1, 1)

    for (i in 1 until map.size) {
        for (j in 1 until map[i].size) {
            print("${map[i][j]} ")
        }
        println()
    }
}

private fun tromino(size: Int, y: Int, x: Int) {
    cur++
    val halfSize = size / 2

    if (check(halfSize, y, x)) map[y + halfSize - 1][x + halfSize - 1] = cur
    if (check(halfSize, y + halfSize, x)) map[y + halfSize][x + halfSize - 1] = cur
    if (check(halfSize, y, x + halfSize)) map[y + halfSize - 1][x + halfSize] = cur
    if (check(halfSize, y + halfSize, x + halfSize)) map[y + halfSize][x + halfSize] = cur
    if (size == 2) return

    tromino(halfSize, y, x)
    tromino(halfSize, y, x + halfSize)
    tromino(halfSize, y + halfSize, x)
    tromino(halfSize, y + halfSize, x + halfSize)
}

private fun check(size: Int, y: Int, x: Int): Boolean {
    for (i in y until y + size) {
        for (j in x until x + size) {
            if (map[i][j] != 0) return false
        }
    }
    return true
}