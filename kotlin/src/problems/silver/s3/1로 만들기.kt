package problems.silver.s3

import java.util.Scanner
import kotlin.math.min

fun main() = with(Scanner(System.`in`)) {
    val num = nextInt()
    val cntList = MutableList(num+1) { 0 }

    // 1을 제외한 num까지 반복.
    for (i in 2 .. num) {
        // 일단 이전의 값에서 1을 더하면 해당 값을 만들 수 있는 개수가 나옴.
        cntList[i] = cntList[i-1] + 1
        // 2, 3으로 나누어 떨어지면 i를 2 또는 3으로 나눈 index에 1을 더하면 만들 수 있는 개수가 나옴.
        // 위에 만든 개수와 2, 3을 나눠 만든 개수 중 더 작은 것을 고르기.
        if (i % 2 == 0) cntList[i] = min(cntList[i], cntList[i/2] + 1)
        if (i % 3 == 0) cntList[i] = min(cntList[i], cntList[i/3] + 1)
    }

    println(cntList[num])
}