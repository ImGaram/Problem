package problems.silver.s3

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val width = nextInt()
    var prev: Long = 0
    var curr: Long = 1

    // 0 1 2 3 5 8 13 21 34 55
    for (i in 1..width) {
        val temp = curr
        curr = (curr + prev) % 10007
        prev = temp
    }

    println(curr)
}