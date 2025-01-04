package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val a = bf.readLine().split(" ").map { it.toInt() }

    var si = 0
    var answer: Long = 0

    while (si < n) {
        var partialSequence = 1
        for (i in si until a.size - 1) {
            if (a[i] > a[i + 1]) break
            else partialSequence++
        }

        answer += partialSequence.toLong() * (partialSequence + 1) / 2

        si += partialSequence
    }

    println(answer)
}

/*for (si in 0 until n) {
       var partialSequence = 1
       for (i in si until a.size - 1) {
           if (a[i] > a[i + 1]) break
           else partialSequence++
       }

       answer += partialSequence
   }*/