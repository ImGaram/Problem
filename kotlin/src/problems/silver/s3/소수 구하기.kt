import java.util.Scanner
import kotlin.math.sqrt

fun main() {
    val sc = Scanner(System.`in`)
    val firstNum = sc.nextInt()
    val lastNum = sc.nextInt()
    val primeList = ArrayList<Int>(lastNum + 1)

    for (i in firstNum - 1 downTo 0) {
        primeList.add(0)
    }

    for (i in firstNum..lastNum) {
        primeList.add(i)
    }

    for (i in firstNum..lastNum) {
        var sqrt = sqrt(i.toDouble()).toInt()
        for (j in 2..sqrt) {
            if (i % j == 0) {
                primeList[i] = 0
                break
            }
        }
    }

    for (j in primeList.indices) {
        if (j == 1) continue
        if (primeList[j] != 0) println(primeList[j])
    }
}