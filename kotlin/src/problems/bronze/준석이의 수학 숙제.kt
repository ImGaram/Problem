package problems.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    val numTokenizer = StringTokenizer(readLine())
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    // 이전의 데이터를 저장해서 현재 데이터 상태에 따라 재활용할 변수들.
    var beforeNumber = 0
    var beforeResult = 0
    for (i in 0 until case) {
        var result = 0
        if (numTokenizer.hasMoreTokens()) {
            val num = numTokenizer.nextToken().toInt()

            if (beforeNumber > num) {
                // 이전 데이터가 현재 데이터보다 크면 DP를 사용할 수 없음.
                for (j in 1..num) {
                    if (j % 3 == 0 || j % 7 == 0) result += j
                }
            } else {
                // 현재 데이터가 이전 데이터보다 크면 DP를 사용할 수 있다.
                result = beforeResult       // result를 이전의 result 값으로 변경한다.
                for (j in beforeNumber+1 .. num) {      // 이전의 번호부터 현재 번호까지 반복(반복이 줄어듬)
                    if (j % 3 == 0 || j % 7 == 0) result += j
                }
            }

            // 이전 데이터를 현재 데이터로 새롭게 저장.
            beforeNumber = num
            beforeResult = result
        }

        bw.write("$result\n")
    }

    // scanner & println: 4128ms
    // scanner & bw: 4081ms
    // br & bw: 3464ms
    // br & stringBuilder: 3589ms
    // dynamic programming: 34ms(최적)
    bw.flush()
    bw.close()
}