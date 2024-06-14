package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var (kindCoins, money) = readLine().split(" ").map { it.toInt() }
    var coinCnt = 0

    val coinArray = Array(kindCoins) { 0 }
    for (i in kindCoins-1 downTo  0) {
        val coin = readLine().toInt()
        coinArray[i] = coin
    }

    for (i in coinArray.indices) {
        if (money == 0) break

        val coin = coinArray[i]
        if (coin <= money) {
            val divValue = money / coin
            money %= coin
            coinCnt += divValue
        }
    }

    println(coinCnt)
}