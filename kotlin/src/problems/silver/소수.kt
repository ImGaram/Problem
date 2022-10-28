import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val minNumber = sc.nextInt()
    val maxNumber = sc.nextInt()

    var totalPrimeNumber = 0
    var minPrimeNumber = maxNumber
    var factorCnt: Int

    // 소수: 약수가 1이랑 자기 자신만을 가지는 수
    // 약수: 나누어 떨어지는 수(예: 8의 약수 = 1,2,4,8)
    for (i in minNumber .. maxNumber) {
        factorCnt = 0

        for (j in 1..i) {
            if (i % j == 0) {
                factorCnt++
            }
        }

        if (factorCnt == 2) {
            if (minPrimeNumber > i) minPrimeNumber = i      // min == 61
            totalPrimeNumber+=i
        }
    }

    if (totalPrimeNumber == 0) {
        println(-1)
    } else {
        println(totalPrimeNumber)
        println(minPrimeNumber)
    }
}