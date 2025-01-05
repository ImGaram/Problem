package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigInteger

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val answer = StringBuilder()

    while (true) {
        var n = bf.readLine().toBigInteger()
        if (n == 0.toBigInteger()) break

        n--
        answer.append("{ ")
        var i = 0

        while (n != 0.toBigInteger()) {
            if (n % 2.toBigInteger() == 1.toBigInteger()) {
                answer.append(nPow(3, i))
                if (n / 2.toBigInteger() != 0.toBigInteger()) answer.append(", ")
                else answer.append(" ")
            }

            n /= 2.toBigInteger()
            i++
        }

        answer.append("}\n")
    }

    println(answer)
}

private fun nPow(n: Int, i: Int): BigInteger {
    var res = 1.toBigInteger()

    repeat(i) {
        res *= n.toBigInteger()
    }

    return res
}