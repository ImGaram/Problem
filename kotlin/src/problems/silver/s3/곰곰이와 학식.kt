package problems.silver.s3

// chicken 3 = pizza 1
// pizza 3 = hamburger 1
// hamburger 3 = chicken 1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val food = readLine().split(" ").map { it.toLong() }.toMutableList()
    val coupon = readLine().split(" ").map { it.toLong() }.toMutableList()
    var sum = 0L

    for (j in 0 until 3) {
        for (i in 0 until food.size) {
            // 기존 식권 교환
            // 음식이 식권보다 많음
            if (coupon[i] - food[i] < 0) {
                sum += coupon[i]
                food[i] -= coupon[i]
                coupon[i] = 0
            } else {
                // 식권이 음식보다 많음
                sum += food[i]
                coupon[i] -= food[i]
                food[i] = 0
            }

            // 남은 식권을 다음 식권으로 교환
            if (i == 2) {
                coupon[0] += coupon[i] / 3
                coupon[i] %= 3L
            } else {
                coupon[i + 1] += coupon[i] / 3
                coupon[i] %= 3L
            }
        }
    }

    println(sum)
}