package problems.bronze.b2

import kotlin.system.exitProcess

fun main() {
    val num = readln().toInt()

    for (i in 1 .. 1000000) {
        var temp = i
        var total = 0
        while (temp != 0) {
            total+=(temp%10)
            temp /=10
        }

        if (i + total == num) {
            println(i)
            exitProcess(0)
        }
    }

    println(0)
}