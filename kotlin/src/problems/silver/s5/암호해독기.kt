package problems.silver.s5

//53
//1 0 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50 51 52
//A BCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val sequence = readLine().toInt()
    val code = readLine().split(" ").map { it.toInt() }
    val resultCode = readLine().toMutableList()
    val formatResCode = mutableListOf<Char>()

    for (c in code) {
        val formatRes = formatCode(c)
        formatResCode.add(formatRes)
    }

    resultCode.sort()
    formatResCode.sort()

    if (resultCode == formatResCode) println("y")
    else println("n")
}

private fun formatCode(code: Int): Char {
    val formatUpperCaseA = 65
    val formatLowerCaseCaseA = 97

    return if (code == 0) ' '
    else if (code < 27) {
        val order = code - 1
        (formatUpperCaseA + order).toChar()
    } else {
        val order = code - 27
        (formatLowerCaseCaseA + order).toChar()
    }
}