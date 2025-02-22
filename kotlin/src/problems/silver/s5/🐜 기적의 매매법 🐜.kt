package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    // 준현(BNP)
    // 보유금에서 살 수 있는 주식은 모두 사고 마지막에 결과를 출력.

    // 성민(TIMING)
    // 3일 연속 가격이 오르면 가격이 떨어진다 가정하고 주식을 판다(가격이 같으면 오른 것으로 치지 않음).
    // 3일 연속 가격이 떨어지면 가격이 오른다 가정하고 주식을 산다(주가가 동일하면 하락한 것이 아님)
    // MachineDuck 기업 주식만 거래함.
    val cash = bf.readLine().toInt()
    val stockPrice = bf.readLine().split(" ").map { it.toInt() }

    // bnp
    var bnpCash = cash
    var bnpWeek = 0
    for (i in stockPrice.indices) {
        if (stockPrice[i] <= bnpCash) {
            bnpWeek += bnpCash / stockPrice[i]
            bnpCash %= stockPrice[i]
        }
    }

    // timing
    var timingCash = cash
    var timingWeek = 0
    var stockChanging = 0
    for (i in 1 until stockPrice.size) {
        if (stockPrice[i - 1] < stockPrice[i]) {
            if (stockChanging < 0) stockChanging = 1
            else stockChanging++
        } else if (stockPrice[i - 1] > stockPrice[i]) {
            if (stockChanging > 0) stockChanging = -1
            else stockChanging--
        } else stockChanging = 0

        if (stockChanging >= 3) {
            timingCash += timingWeek * stockPrice[i]
            timingWeek = 0
        } else if (stockChanging <= -3) {
            if (stockPrice[i] <= timingCash) {
                timingWeek += timingCash / stockPrice[i]
                timingCash %= stockPrice[i]
            }
        }
    }

    val answerBnp = bnpCash + bnpWeek * stockPrice.last()
    val answerTiming = timingCash + timingWeek * stockPrice.last()

    if (answerBnp > answerTiming) println("BNP")
    else if (answerBnp < answerTiming) println("TIMING")
    else println("SAMESAME")
}