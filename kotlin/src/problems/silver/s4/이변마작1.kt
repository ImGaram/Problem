package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val st = StringTokenizer(bf.readLine())
    val mahjong = mutableMapOf<String, Int>()

    var answer = 0
    for (i in 1 .. n) {
        val pae = st.nextToken()

        if (mahjong.containsKey(pae)) mahjong[pae] = mahjong[pae]!! + 1
        else mahjong[pae] = 1

        if (mahjong[pae] == 5) {
            answer = i
            break
        }
    }

    println(answer)
}