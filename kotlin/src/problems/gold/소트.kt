package src.problems.gold

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    readLine()
    var sortList = readLine().split(" ").map { it.toInt() }.toMutableList()
    val sortLimit = readLine().toString().toInt()
    var limitLeft = sortLimit           // 남은 이동 수.
    val logicList = sortList            // 로직 수행 중 변경할 리스트.
    val resultStr = StringBuilder()     // 결과 출력용 string

    // 9 2 8 10인 경우 sortCnt가 10이 있는 index의 위치보다 큰 경우 index만큼 옮기고 sortCnt를 그만큼 올리기.
    // 정렬이 되었으면 그 값을 빼고 그 다음으로 큰 값으로 1번의 과정을 반복함.
    // index의 위치보다 남은 sortCnt가 더 적은 경우 정렬이 안된 데이터를 옮기기.
    while (limitLeft > 0) {
        if (logicList.isEmpty()) break

        val currentMax = logicList.max()
        val currentMaxIndex = logicList.indexOf(currentMax)
        // 남은 이동 수가 현재 최대값의 index보다 크거나 같아야 함.
        if (currentMaxIndex <= limitLeft) {
            logicList.remove(currentMax)
            resultStr.append("$currentMax ")
            limitLeft -= currentMaxIndex
        } else {
            val subList = logicList.subList(0, limitLeft+1)
            val subMax = subList.max()
            val subMaxIndex = subList.indexOf(subMax)

            logicList.remove(subMax)
            resultStr.append("$subMax ")
            limitLeft -= subMaxIndex
        }

        sortList = logicList
    }

    resultStr.append(sortList.joinToString(" "))
    println(resultStr)
}