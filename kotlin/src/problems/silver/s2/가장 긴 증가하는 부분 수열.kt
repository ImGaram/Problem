package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.max

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    val arr = Array(case) { 1 }
    val nums = readLine().split(" ").map { it.toInt() }

    for (i in 0 until case) {
        for (j in 0 until i) {
            if (nums[i] > nums[j]) {
                arr[i] = max(arr[i], arr[j] + 1)
            }
        }
    }

    println(arr.max())
}