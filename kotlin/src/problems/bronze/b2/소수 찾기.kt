import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val countNum = sc.nextInt()
    var numCount: Int
    var primeNumber = 0

    repeat(countNum) {
        val number = sc.nextInt()
        numCount = 0

        for (i in 1..number) {
            if (number % i == 0) numCount++
        }

        if (numCount == 2) primeNumber++
    }
    print(primeNumber)
}