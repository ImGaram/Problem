package algorithm

import java.util.Scanner
import kotlin.math.min

private var resultList = arrayOf<Int>()

fun main() = with(Scanner(System.`in`)) {
    val str = next()
    var string = ""
     resultList = Array(str.length*2+1) { 0 }

    for (i in str.indices) {
        string += "*"
        string += str[i].toString()
    }
    string += "*"

    println(string)

    palindrome(string, string.length)
    println(resultList.contentToString())
}

private fun palindrome(s: String, n: Int) {
    var r = 0
    var p = 0

    for (i in 0 until n) {
        if (i <= r) {
            resultList[i] = min(resultList[2 * p - i], r - i)
            if (i % 2 == 0) println("${resultList[2 * p - i]} ${r - i}")
        }
        else resultList[i] = 0

        while (i - resultList[i] - 1 >= 0 && i + resultList[i] + 1 < n && s[i - resultList[i] -1] == s[i + resultList[i] +1]) {
            if (i == 7) println("plus")
            resultList[i]++
        }

        if (r < i + resultList[i]) {
            r = i + resultList[i]
            p = i
        }
    }
}