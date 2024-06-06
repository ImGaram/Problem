package src.problems.silver

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()
    val m = nextInt()

    var factorialN = 1L.toBigInteger()
    for (i in n-m+1 .. n) {
        factorialN *= i.toBigInteger()
    }

    var factorialM = 1L.toBigInteger()
    for (i in 1 .. m) {
        factorialM *= i.toBigInteger()
    }

    println(factorialN / factorialM)
}