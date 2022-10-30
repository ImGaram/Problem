package problems.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val cnt = bf.readLine().toInt()

    val arr = IntArray(cnt)
    repeat(cnt) { arr[it] = bf.readLine().toInt() }
    bf.close()

    arr.sort()
    for (i in 0 until cnt) {
        bw.write(arr[i].toString())
        bw.newLine()
    }

    bw.flush()
    bw.close()
}