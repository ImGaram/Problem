package problems.silver

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val fillArray = Array(nextInt()) { 0 }

    for (i in fillArray.indices) {
        if (i == 0) fillArray[0] = 1
        else {
            // 홀수 index임
            if (i % 2 != 0) fillArray[i] = fillArray[i-1] *2 +1
            else fillArray[i] = fillArray[i-1] *2 -1
            fillArray[i] %= 10007
        }
    }

    println(fillArray.last())
}