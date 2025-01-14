package problems.silver.s2

    import java.io.BufferedReader
    import java.io.InputStreamReader
    import kotlin.math.abs

    fun main() {
        val bf = BufferedReader(InputStreamReader(System.`in`))
        val n = bf.readLine().toInt()
        val x = bf.readLine().split(" ").map { it.toInt() }.toMutableList()
        val t = bf.readLine().split(" ").map { it.toInt() }.toMutableList()

        var truck = 0   // 트럭의 위치
        var time = 0
        for (i in x.lastIndex downTo 0) {
            val move = abs(x[i] - truck)
            time += move

            if (time < t[i]) time = t[i]
            truck = x[i]
        }

        println(truck + time)
    }