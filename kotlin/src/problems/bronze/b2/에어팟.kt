package problems.bronze.b2

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val n = bf.readLine().toInt()
    val connect = bf.readLine().split(" ").map { it.toInt() }
    var currentConnect = connect.first()
    var battery = 2
    var wasteValue = 2

    for (i in 1 until connect.size) {
        if (currentConnect == connect[i]) {
            battery += wasteValue * 2
            wasteValue *= 2
        } else {
            battery += 2
            wasteValue = 2
        }

        if (battery >= 100) {
            battery = 0
            wasteValue = 1
        }

        currentConnect = connect[i]
    }

    println(battery)
}