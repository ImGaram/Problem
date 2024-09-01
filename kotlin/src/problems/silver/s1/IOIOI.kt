package problems.silver.s1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val oCnt = readLine().toInt()
    val stringLength = readLine().toInt()
    val string = readLine()

    val checkString = StringBuilder()
    for (i in 1 .. oCnt * 2 + 1) {
        checkString.append(
            if (i % 2 == 0) "O"
            else "I"
        )
    }


    val check = StringBuilder()     // 현재 문자열을 직접 받으면서 체크함.
    val ioCntList = MutableList(stringLength) { 0 }     // OI가 얼마나 연속되어서 나타나는지 확인.
    var ioCntIndex = 0  // ioCntList에 값이 추가될 index
    var firstI = false  // OI를 체크하기 전에 첫 번째에 I가 있는지 확인.
    for (i in 0 until stringLength) {
        if (!firstI && string[i] == 'I') firstI = true

        if (firstI && string[i] == 'O' && check.isEmpty()) check.append("O")
        else if (check.isNotEmpty() && firstI && string[i] == 'I' && check.last() == 'O') check.append("I")
        else {
            check.clear()
            if (string[i] != 'I') firstI = false
            if (ioCntList[ioCntIndex] != 0) ioCntIndex++
        }

        if (check.toString() == "OI") {
            check.clear()
            ioCntList[ioCntIndex]++
        }
    }

    var res = 0
    for (i in 0 until ioCntList.size) {
        if (ioCntList[i] == 0) break

        if (ioCntList[i] >= oCnt)
            res += ioCntList[i] - (oCnt - 1)
    }

    println(res)
}