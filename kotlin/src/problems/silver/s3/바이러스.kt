package src.problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    readLine()      // 컴의 개수.
    val case = readLine().toInt()  // 연결된 컴퓨터 쌍의 수.
    val list = mutableListOf<List<String>>()

    for (i in 0 until case) {
        list.add(readLine().split(" "))
    }

    val infectionList = mutableSetOf("1")
    // 1부터 시작해 target에 포함하는 데이터가 있는가? 있으면 infectionList에 데이터 추가.
    // 1을 포함하는 데이터가 있으면, 1과 연결된 데이터로 값을 변경하고 다시 반복
    var infectTarget = listOf("1")
    while (list.size > 0) {
        // 감염된 컴퓨터들의 리스트
        val infect = mutableListOf<List<String>>()
        // 감염 타겟
        val target = mutableListOf<String>()
        // 이 로직에서 감염된 컴퓨터 리스트를 찾기.
        for (i in list) {
            for (ti in infectTarget.indices) {
                if (i.contains(infectTarget[ti])) {
                    infect.add(i)
                    target.add(if (i[0] != infectTarget[ti]) i[0] else i[1])
                }
            }
        }

        infectTarget = target
        // 감염된 컴퓨터가 없으면 반복 종료
        if (infect.isEmpty()) break

        // 감염 리스트에 감염된 컴 번호 추가 및 추가된 데이터 삭제.
        for (computers in infect) {
            infectionList.addAll(computers)
            list.remove(computers)
        }
    }

    println(infectionList.size - 1)
}