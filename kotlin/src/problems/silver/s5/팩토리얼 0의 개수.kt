package src.problems.silver

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val num = nextInt()

    var factorial = 1.toBigInteger()
    for (i in 1 .. num) {
        factorial *= i.toBigInteger()
    }

    var zeroCnt = 0
    val factorialString = factorial.toString()
    for (i in factorialString.length-1 downTo 0) {
        if (factorialString[i] == '0') zeroCnt++
        else break
    }

    println(zeroCnt)
}