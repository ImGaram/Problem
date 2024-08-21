package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val arrIndex = bf.readLine().toInt()
    val st = StringTokenizer(bf.readLine())

    val array = IntArray(arrIndex)
    repeat(arrIndex) { i ->
        array[i] = st.nextToken().toInt()
    }

    val res = IntArray(arrIndex)
    for (i in 0 until arrIndex) {
        if (res[i] == 0) res[i] = 1
        for (j in 0 until arrIndex) {
            // array[i]보다 큰 경우
            if (array[i] < array[j]) {
                if (res[i] < res[j]+1) res[i] = res[j] + 1
            }
        }
    }
    res.sort()
    println(res[arrIndex-1])
}