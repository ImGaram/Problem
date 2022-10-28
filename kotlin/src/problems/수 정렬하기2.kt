import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val numCount = bf.readLine().toInt()

    val numArray = ArrayList<Int>(numCount)
    for (i in 0 until numCount) {
        numArray.add(i, bf.readLine().toInt())
    }

    numArray.sort()
    for (i in numArray.indices) println(numArray[i])
}