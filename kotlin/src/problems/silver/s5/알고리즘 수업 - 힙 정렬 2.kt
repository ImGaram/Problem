package problems.silver.s5

import java.io.BufferedReader
import java.io.InputStreamReader

private var k = 0
private var swapCnt = 0
private var answer = "-1"

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val ak = bf.readLine().split(" ").map { it.toInt() }
    val array = bf.readLine().split(" ").map { it.toInt() }.toTypedArray()
    k = ak[1]

    heapSort(array)

    println(answer)
}

private fun heapSort(array: Array<Int>) {
    val n = array.size

    for (i in n / 2 - 1 downTo 0) {
        heapify(array, n, i)
    }

    for (i in n - 1 downTo 0) {
        swap(array, 0, i)
        heapify(array, i, 0)
    }
}

private fun swap(array: Array<Int>, i: Int, j: Int) {
    val temp = array[i]
    array[i] = array[j]
    array[j] = temp

    if (i != j) {
        swapCnt++
        if (swapCnt == k) answer = array.joinToString(" ")
    }
}

private fun heapify(array: Array<Int>, size: Int, root: Int) {
    var smallest = root
    val left = 2 * root + 1
    val right = 2 * root + 2

    if (left < size && array[left] < array[smallest]) {
        smallest = left
    }

    if (right < size && array[right] < array[smallest]) {
        smallest = right
    }

    if (smallest != root) {
        swap(array, root, smallest)
        heapify(array, size, smallest)
    }
}