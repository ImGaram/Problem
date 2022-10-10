import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val number = bf.readLine()
    val numArray = number.toCharArray().toList().sortedDescending()

    for (i in numArray.indices) print(numArray[i])
}