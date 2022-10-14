package algorithm

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val arrayIndex = bf.readLine().toInt()

    val array = IntArray(arrayIndex)
    repeat(arrayIndex) {
        array[it] = it+1
    }

    val searchData = bf.readLine().toInt()

    println(binarySearch(array, searchData, 0, array.lastIndex))
}

fun binarySearch(array: IntArray, searchData: Int, low: Int, high: Int): Int {
    // 값을 찾을 수 없는 경우
    if (low > high) return -1

    // 중앙 값 결정하기
//    val mid = low + (high - low)/2    범위를 넘어서는 경우 구현
    val mid = (high-low)/2

    return if (array[mid] == searchData) {
        array[mid]
    } else if (array[mid] > searchData) {   // 찾는 값이 데이터보다 큼
        binarySearch(array, searchData, low, mid-1)
    } else {    // 찾는 값이 데이터보다 작음
        binarySearch(array, searchData, mid+1, high)
    }
}
