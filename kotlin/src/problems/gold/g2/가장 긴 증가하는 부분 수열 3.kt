package problems.gold.g2

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

private var sequence = mutableListOf<Int>()

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val size = readLine().toInt()
    val input = StringTokenizer(readLine())

    sequence.add(input.nextToken().toInt())
    for (i in 1 until size) {
        val number = input.nextToken().toInt()
        if (number > sequence.last()) {
            sequence.add(number)
        } else {
            binarySearch(0, sequence.size -1, number)
        }
    }

    println(sequence.size)
}

private fun binarySearch(start: Int, end: Int, number: Int) {
    val mid = (start + end) / 2
    if (start > end) {
        sequence[start] = number
        return
    }

    // mid가 number보다 크다면?
    // mid 이후의 값들은 정답이 아님.
    if (sequence[mid] > number) {
        binarySearch(start, mid - 1, number)
    }
    // mid가 number보다 작거나 같으면?
    // mid포함 이전의 값들은 정답이 아님.
    else if (sequence[mid] < number) {
        binarySearch(mid+1, end, number)
    }
    else {
        sequence[mid] = number
        return
    }
}