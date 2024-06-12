package problems.bronze

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val straight = nextInt()
    val circleHalf = nextInt()
    val pi = 3.141592

    println(straight*2 + (2*pi*circleHalf))
}