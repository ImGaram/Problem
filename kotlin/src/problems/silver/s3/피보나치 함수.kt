import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))

    val t = bf.readLine().toInt()
    repeat(t) {
        val num = bf.readLine().toInt()
        println("${fibonacci(num-1)} ${fibonacci(num)}")
    }

}

fun fibonacci(num: Int): Int {
    if (num == 0) return 0
    if (num==1) return 1
    var a = 0
    var b = 1
    var t = 0
    for (i in 2..num) {
        t = a
        a = b
        b += t
    }
    return b
}