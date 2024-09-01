package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader

private var lan = mutableListOf<Int>()
private var cnt = 0

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val input = readLine().split(" ").map { it.toInt() }
    val case = input[0]
    cnt = input[1]
    var max = 0

    for (i in 0 until case) {
        val num = readLine().toInt()
        if (max < num) max = num
        lan.add(num)
    }

    binarySearch(1, max / 2, max)
}

private fun binarySearch(start: Int, mid: Int, end: Int) {
    if (start >= mid) {
        var resultCut = 0
        for (i in 0 until lan.size) {
            resultCut += lan[i] / end
        }

        if (resultCut < cnt) println(start)
        else println(end)

        return
    }

    var cut = 0                 // midValue로 자른 값의 합.
    for (i in 0 until lan.size) {
        cut += lan[i] / mid
    }

    // 자른 값(cut)이 구해야 하는 양(cnt)보다 크거나 같으면 mid를 기준으로 이전의 값들은 모두 정답이 아니게 된다.
    if (cut >= cnt) {
        // mid 이후의 값으로 범위를 다시 설정해 재귀 함수 호출
        binarySearch(mid, mid + (end - mid) / 2, end)
    }
    // 자른 값(cut)이 구해야 하는 양(cnt)보다 작은 경우 mid를 기준으로 이후의 값들은 모두 정답이 아니게 된다.
    else {
        // mid 이전의 값으로 범위를 다시 설정해 재귀 함수 호출
        binarySearch(start, start + (mid - start) / 2, mid)
    }
}