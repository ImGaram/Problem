fun main() {
    val num = readln().toInt()

    var fibonacci = 0L
    var fibonacci2 = 1L
    var fibonacciTotal = 0L
    var fibonacciCnt = 1
    when (num) {
        0 -> println(0)
        1 -> println(1)
        else -> {
            while (fibonacciCnt < num) {
                fibonacciTotal = fibonacci+fibonacci2
                fibonacci = fibonacci2
                fibonacci2 = fibonacciTotal
                fibonacciCnt++
            }
            println(fibonacciTotal)
        }
    }

}