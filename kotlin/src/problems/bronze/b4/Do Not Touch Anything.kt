package problems.bronze.b4

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val h = nextInt()
    val w = nextInt()
    val cctv = nextInt()

    // h를 모두 감싸는 데 필요한 cctv의 개수.
    val coverH = if (h % cctv != 0) (h / cctv + 1).toBigInteger() else (h / cctv).toBigInteger()
    // w를 모두 감싸는 데 필요한 cctv의 개수.
    val coverW = if (w % cctv != 0) (w / cctv + 1).toBigInteger() else (w / cctv).toBigInteger()

    println(coverH * coverW)
}