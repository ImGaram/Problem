package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var st = StringTokenizer(readLine())
    var num = st.nextToken().toInt()

    val array = Array(num) { 0L }

    while (num > 0) {
        if (st.hasMoreTokens()) {
            num--
            array[num] = st.nextToken().reversed().toLong()
        } else st = StringTokenizer(readLine())
    }

    array.sort()
    println(array.joinToString("\n"))
}