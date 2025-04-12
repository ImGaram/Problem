package problems.bronze.b1

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    var total = 0
    var need = 0
    var turn = true

    while (true) {
        need++

        if (n - total < need) {
            if (turn) println(need - (n - total))
            else println(0)

            break
        }

        total += need
        turn = !turn
    }
}