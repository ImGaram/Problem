package problems.bronze.b5

import java.util.*

fun main() {
    val st = StringTokenizer(readln())
    // 1 1 2 2 2 8
    val arr = IntArray(6)
    repeat(6) {
        arr[it]=st.nextToken().toInt()
    }

    repeat(6) { i ->
        if (i < 2) print("${1-arr[i]} ")
        else if (i < 5) print("${2-arr[i]} ")
        else print("${8-arr[i]} ")
    }
}