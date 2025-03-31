package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))

    while (true) {
        val s = bf.readLine()
        var res = true

        if (s == "end") break

        var vowelsContains = false
        var vowelsCnt = 0
        var consonantsCnt = 0
        val vowels = listOf('a', 'e', 'i', 'o', 'u')
        for (si in s.indices) {
            if (vowels.contains(s[si])) {
                vowelsContains = true

                consonantsCnt = 0
                vowelsCnt++

                if (vowelsCnt == 3) res = false
            } else {
                consonantsCnt++
                vowelsCnt = 0

                if (consonantsCnt == 3) res = false
            }

            if (si > 0) {
                if (s[si] == s[si - 1]) {
                    if (s[si] != 'e' && s[si] != 'o') {
                        res = false
                    }
                }
            }
        }

        if (!vowelsContains) res = false

        when (res) {
            true -> println("<${s}> is acceptable.")
            false -> println("<${s}> is not acceptable.")
        }
    }
}