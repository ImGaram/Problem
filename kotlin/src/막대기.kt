import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val cm = bf.readLine().toInt()
    bf.close()

    var stick = 64
    var cut = 0
    var total = 0
    var temp = cm
    while (total < cm) {
        while (stick > temp) {
            stick/=2
        }

        total+=stick
        temp-=stick
        cut+=1
    }

    println(cut)
}