package problems.bronze

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val case = nextInt()

    for (i in 1 .. case) {
        var hydraHead = nextInt()
        val actions = next()

        for (action in actions) {
            if (hydraHead == 0) break
            when (action) {
                'c' -> hydraHead++
                'b' -> hydraHead--
            }
        }

        println("Data Set $i:")
        println("$hydraHead\n")
    }
}