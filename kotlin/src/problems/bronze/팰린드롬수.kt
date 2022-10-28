import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))

    while (true) {
        val number = bf.readLine()
        if (number == "0") break

        if (number.length % 2 == 0) {
            val midIndex = number.chunked(number.length/2)
            val front = midIndex[0]
            val end = midIndex[1]

            val resultEnd = front.toCharArray().sorted().joinToString("")
            val resultEnd2 = end.toCharArray().sorted().joinToString("")
            if (end.equals(resultEnd) || front.equals(resultEnd2)) println("yes")
            else println("no")
        } else {
            val midIndex = number.length/2+1
            val front = number.substring(0, midIndex-1)
            val end = number.substring(midIndex)

            val resultEnd = front.toCharArray().sorted().joinToString("")
            val resultEnd2 = end.toCharArray().sorted().joinToString("")
            if (end.equals(resultEnd) || front.equals(resultEnd2)) println("yes")
            else println("no")
        }
    }
}