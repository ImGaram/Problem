import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val data = bf.readLine().split(":")
    val n = data[0].toInt()
    val m = data[1].toInt()

    var gcdNumber = 0
    gcdNumber = if (n > m) gcd(n, m) else gcd(m, n)

    println("${n/gcdNumber}:${m/gcdNumber}")
}

// 유클리드 호제법 알고리즘
fun gcd(n: Int, m: Int): Int {
    return if (m==0) n
    else gcd(m, n%m)
}