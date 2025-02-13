package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val (n, t) = bf.readLine().split(" ").map { it.toInt() }
    val rotate = listOf("px", "my", "mx", "py")
    var currentRotate = 0

    var x = 0
    var y = 0
    var time = 0

    for (ni in 0 until n) {
        val (ti, si) = bf.readLine().split(" ")
        val moveTime = ti.toInt()

        when (rotate[currentRotate]) {
            "px" -> x += moveTime - time
            "my" -> y -= moveTime - time
            "mx" -> x -= moveTime - time
            "py" -> y += moveTime - time
        }

        if (si == "right") {
            currentRotate++
            if (currentRotate == 4) currentRotate = 0
        } else {
            currentRotate--
            if (currentRotate == -1) currentRotate = 3
        }

        time = moveTime
    }

    when (rotate[currentRotate]) {
        "px" -> x += t - time
        "my" -> y -= t - time
        "mx" -> x -= t - time
        "py" -> y += t - time
    }

    println("$x $y")
}