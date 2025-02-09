package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val t = bf.readLine().toInt()
    val nums = eratosthenes()

    for (ti in 0 until t) {
        val n = bf.readLine().toInt()

        println(getMinMultiple(nums, n))
    }
}

private fun eratosthenes(): List<Int> {
    val res = Array(100001) { it }
    val primeNumbers = mutableListOf<Int>()

    for (i in 2 .. 100000) {
        if (res[i] == 0) continue

        primeNumbers.add(i)
        for (j in i * 2 .. 100000 step i) {
            res[j] = 0
        }
    }

    return primeNumbers
}

private fun getMinMultiple(nums: List<Int>, n: Int): Int {
    var answer = Int.MAX_VALUE
    var si = 0
    var ei = nums.lastIndex

    while (si < ei) {
        val result = nums[si] * nums[ei]

        if (n < result) {
            if (answer > result) answer = result
            ei--
        } else if (n > result) {
            si++
        } else {
            answer = result
            break
        }
    }

    return answer
}