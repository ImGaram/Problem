package problems.bronze.b3

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    while (true) {
        val nums = readLine().split(" ")
        var num1 = nums[0].toInt()
        var num2 = nums[1].toInt()
        if (num1 == 0 && num2 == 0) break

        var cnt = 0
        var sum = 0
        while (num1 != 0 || num2 != 0) {
            sum = (sum / 10) + (num1 % 10) + (num2 % 10)
            if (sum >= 10) cnt++

            num1 /= 10
            num2 /= 10
        }

        println(cnt)
    }
}