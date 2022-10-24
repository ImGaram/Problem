import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val str = bf.readLine().split(",")

    var total = 0
    repeat(str.size) { i ->
        total+=str[i].toInt()
    }
    print(total)
}