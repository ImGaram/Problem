package problems.gold.g5

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    val input = StringTokenizer(readLine())
    val tower: Stack<List<Int>> = Stack()     // 탑의 정보(몇 번째 탑인지, 높이가 들어감)
    val resultStr = StringBuilder()     // 출력할 string.

    for (i in 0 until case) {
        val addValue = input.nextToken().toInt()

        while (tower.isNotEmpty()) {
            if (tower.peek()[1] >= addValue) {
                resultStr.append("${tower.peek()[0]} ")
                break
            }
            tower.pop()
        }

        if (tower.isEmpty()) {
            resultStr.append("0 ")
        }
        tower.push(listOf(i+1, addValue))
    }

    println(resultStr)
}