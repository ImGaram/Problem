package problems.bronze

import java.util.StringTokenizer

fun main() {
    val num = readln().toInt()
    val st = StringTokenizer(readln())

    val array = IntArray(num)
    var sameCnt = 0
    repeat(num) {
        array[it] = st.nextToken().toInt()
    }
    val searchNum = readln().toInt()

    repeat(num) {
        if (array[it] == searchNum) sameCnt++
    }
    println(sameCnt)
}