package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val row = listOf("A", "B", "C", "D", "E", "F", "G", "H")
    val column = listOf("8", "7", "6", "5", "4", "3", "2", "1")

    val (k, s, m) = bf.readLine().split(" ")
    val king = k.map { it.toString() }
    val stone = s.map { it.toString() }

    var kir = row.indexOf(king[0])
    var kic = column.indexOf(king[1])
    var sir = row.indexOf(stone[0])
    var sic = column.indexOf(stone[1])

    for (mi in 0 until m.toInt()) {
        val moving = bf.readLine()
        var mr = 0
        var mc = 0

        when (moving) {
            "R" -> {
                if (kir + 1 in row.indices) {
                    mr = 1
                }
            }
            "L" -> {
                if (kir - 1 in row.indices) {
                    mr = -1
                }
            }
            "B" -> {
                if (kic + 1 in column.indices) {
                    mc = 1
                }
            }
            "T" -> {
                if (kic - 1 in column.indices) {
                    mc = -1
                }
            }
            "RT" -> {
                if (kir + 1 in row.indices && kic - 1 in column.indices) {
                    mr = 1
                    mc = -1
                }
            }
            "LT" -> {
                if (kir - 1 in row.indices && kic - 1 in column.indices) {
                    mr = -1
                    mc = -1
                }
            }
            "RB" -> {
                if (kir + 1 in row.indices && kic + 1 in column.indices) {
                    mr = 1
                    mc = 1
                }
            }
            "LB" -> {
                if (kir - 1 in row.indices && kic + 1 in column.indices) {
                    mr = -1
                    mc = 1
                }
            }
        }

        if (kir + mr == sir && kic + mc == sic) {
            if (sir + mr in row.indices && sic + mc in column.indices) {
                sir += mr
                sic += mc
            } else {
                mr = 0
                mc = 0
            }
        }

        kir += mr
        kic += mc
    }

    println("${row[kir]}${column[kic]}")
    println("${row[sir]}${column[sic]}")
}