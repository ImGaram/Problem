package problems.silver.s3

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val (numCnt, case) = readLine().split(" ").map { it.toInt() }
    val nums = readLine().split(" ").map { it.toInt() }
    val prefixSum = Array(numCnt + 1) { 0 }

    for (i in nums.indices) {
        prefixSum[i + 1] = prefixSum[i] + nums[i]
    }

    for (i in 0 until case) {
        val (start, end) = readLine().split(" ").map { it.toInt() }

        bw.write("${prefixSum[end] - prefixSum[start - 1]}\n")
    }

    bw.flush()
    bw.close()
}