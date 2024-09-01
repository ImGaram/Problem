package problems.bronze.b4

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val total = sc.nextInt()
    val kind = sc.nextInt()
    var totalPrice = 0

    repeat(kind) {
        val price = sc.nextInt()
        val cnt = sc.nextInt()

        totalPrice+=price*cnt
    }

    if (total == totalPrice) println("Yes")
    else println("No")
}