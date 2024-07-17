package problems.bronze

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

private var size = 0
private var array: Array<Int> = arrayOf()
private var duringArray: Array<Int> = arrayOf()
private var result = 0

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    size = readLine().toInt()
    val arrayA = StringTokenizer(readLine())
    val arrayB = StringTokenizer(readLine())

    array = Array(size + 1) { 0 }
    duringArray = Array(size + 1) { 0 }
    for (i in 1 .. size) {
        array[i] = arrayA.nextToken().toInt()
        duringArray[i] = arrayB.nextToken().toInt()
    }

    if (array.contentEquals(duringArray)) println(1)
    else {
        selectionSort()
        println(result)
    }
}

private fun selectionSort() {
    for (last in size downTo 2) {
        var maxValue = 0
        var indexMax = last
        for (j in 1 .. last) {
            if (maxValue < array[j]) {
                maxValue = array[j]
                indexMax = j
            }
        }

        if (indexMax != last) {
            val temp = array[indexMax]
            array[indexMax] = array[last]
            array[last] = temp
        }

        if (array.contentEquals(duringArray)) {
            result = 1
            break
        }
    }
}