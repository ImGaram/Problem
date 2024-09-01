package algorithm

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val number = bf.readLine().split(" ")

    var a = number[0].toInt()
    var b = number[1].toInt()

    var c: Int
    while (b != 0) {
        c = a % b
        a = b
        b = c
    }
    println(a)
}

fun gcd(a: Int, b: Int): Int {
    return if (b==0) a
    else gcd(a, a%b)
}
