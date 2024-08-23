package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()

    for (c in 0 until case) {
        val number = readLine().toInt()
        var isPalindrome = 0

        for (f in 2 .. 64) {
            val formation = converter(f, number)

            if (formation.reversed() == formation) {
                isPalindrome = 1
                break
            }
        }

        println(isPalindrome)
    }
}

private fun converter(digits: Int, number: Int): String {
    var num = number
    val sb = StringBuilder()

    if (num == 0) return "0"

    while (num != 0) {
        val remain = num % digits

        if (remain > 9) sb.insert(0, (remain + 55).toChar())
        else sb.insert(0, remain)

        num /= digits
    }

    return sb.toString()
}