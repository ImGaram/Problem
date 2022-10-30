package problems.bronze

import java.util.StringTokenizer
import kotlin.system.exitProcess

fun main() {
    val case = readln().split(" ")
    val card = case[0].toInt()
    val num = case[1].toInt()

    val st = StringTokenizer(readln())
    val arr = IntArray(card)
    repeat(card) { arr[it] = st.nextToken().toInt() }

    var res = 0
    for (i in 0 until arr.size-2) {
        for (j in i+1 until arr.size-1) {
            for (k in j+1 until arr.size) {
                val total = arr[i]+arr[j]+arr[k]
                if (total in (res + 1)..num) {
                    res = total
                }

                if (total == num) {
                    println(total)
                    exitProcess(0)
                }
            }
        }
    }

    println(res)
}