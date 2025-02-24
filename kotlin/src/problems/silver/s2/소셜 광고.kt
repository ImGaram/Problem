package problems.silver.s2

import java.io.BufferedReader
import java.io.InputStreamReader


private var n = 0
private var isAd = intArrayOf()
private var friend = arrayOf(mutableListOf<Int>())
private var res = Int.MAX_VALUE

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val t = bf.readLine().toInt()

    for (ti in 0 until t) {
        n = bf.readLine().toInt()
        res = Int.MAX_VALUE
        friend = Array(n + 1) { mutableListOf() }

        for (ni in 1 .. n) {
            val follow = bf.readLine().split(" ").map { it.toInt() }

            for (fi in 1 until follow.size) {
                friend[ni].add(follow[fi])
            }
        }

        isAd = IntArray(n + 1)
        search(0, 0)

        println(res)
    }
}

private fun search(user: Int, adCnt: Int) {
    if (adCnt >= res) return

    if (user == n) {
        for (i in 1 .. n) {
            if (isAd[i] == 0) return
        }
        res = adCnt
        return
    }

    isAd[user + 1]++
    for (follow in friend[user + 1]) {
        isAd[follow]++
    }
    search(user + 1, adCnt + 1)

    isAd[user + 1]--
    for (follow in friend[user + 1]) {
        isAd[follow]--
    }
    search(user + 1, adCnt)
}