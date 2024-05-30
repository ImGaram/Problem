package src.problems.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val result = StringBuilder()
    // 가지고 있는 카드 개수
    val havingCnt = readLine().toInt()
    val havingList = hashSetOf<String>()
    val havingCard = StringTokenizer(readLine())
    repeat(havingCnt) {
        if (havingCard.hasMoreTokens()) {
            if (it == havingCnt - 1) havingList.add(havingCard.nextToken())
            else havingList.add(havingCard.nextToken())
        }
    }

    // 가지고 있는지 확인해야 할 카드 정보
    val checkHavingCnt = readLine().toInt()
    val checkHavingCard = StringTokenizer(readLine())
    repeat(checkHavingCnt) {
        // 리스트화 후 중복되는 값이 있으면 1, 아니면 0
        if (checkHavingCard.hasMoreTokens()) {
            if (havingList.contains(checkHavingCard.nextToken())) result.append("1 ")
            else result.append("0 ")
        }
    }

    val bw = BufferedWriter(OutputStreamWriter(System.out))
    bw.write(result.toString())
    bw.flush()
    bw.close()
}