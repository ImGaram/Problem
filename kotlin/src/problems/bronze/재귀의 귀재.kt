package problems.bronze

import java.util.Scanner

private var recursionCallCnt = 0
fun main() = with(Scanner(System.`in`)) {
    val case = nextInt()

    for (i in 0 until case) {
        val string = next()
        println("${isPalindrome(string)} $recursionCallCnt")
        recursionCallCnt = 0
    }
}

private fun recursion(s: String, l: Int, r: Int): Int {
    recursionCallCnt++
    return if (l >= r) 1
    else if (s[l] != s[r]) 0
    else recursion(s, l+1, r-1)
}

private fun isPalindrome(s: String): Int {
    return recursion(s, 0, s.length-1)
}