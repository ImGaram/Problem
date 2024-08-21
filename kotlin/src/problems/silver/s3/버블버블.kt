package problems.silver.s3

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer
import kotlin.math.min

private var array = arrayOf<Int>()
private var ascCnt = 0
private var descCnt = 0

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val size = readLine().toInt()
    val st = StringTokenizer(readLine())
    array = Array(size) { 0 }
    val saveList = mutableListOf<Int>()

    for (i in 0 until size) {
        val numToken = st.nextToken().toInt()
        array[i] = numToken
        saveList.add(numToken)
    }
    // 오름차순 정렬과 내림차순 정렬의 횟수를 각각 구한 후, 내림차순 값 + 1과 오름차순 값 중 더 작은 값을 출력.
    ascSort()

    array = saveList.toTypedArray()
    descSort()

    println(min(ascCnt, descCnt +1))
}

// 오름차순 정렬
private fun ascSort() {
    while (true) {
        var isFinish = false

        for (i in 0 until array.size - 1) {
            if (array[i] > array[i + 1]) {
                val data = array[i]
                isFinish = true

                array[i] = array[i + 1]
                array[i + 1] = data
                ascCnt++
            }
        }

        if (!isFinish) break
    }
}

private fun descSort() {
    while (true) {
        var isFinish = false

        for (i in 1 until array.size) {
            if (array[i] > array[i - 1]) {
                val data = array[i]
                isFinish = true

                array[i] = array[i - 1]
                array[i - 1] = data
                descCnt++
            }
        }

        if (!isFinish) break
    }
}