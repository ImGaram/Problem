import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val arrayIndex = bf.readLine().toInt()
    val st = StringTokenizer(bf.readLine())

    val array = arrayListOf<Int>()
    repeat(arrayIndex) {
        if (st.hasMoreTokens())
            array.add(st.nextToken().toInt())
    }

    val searchArrayIndex = bf.readLine().toInt()
    val data = bf.readLine().split(" ")
    val searchArray = arrayListOf<Int>()
    repeat(searchArrayIndex) {
        searchArray.add(data[it].toInt())
    }

    val result = IntArray(searchArrayIndex)
    val tempArr = searchArray.sorted()
    println(searchArray.sorted())
    repeat(arrayIndex) { i ->
        // 10
        result[i] = binarySearch(tempArr, array[i], 0, searchArray.lastIndex)
    }

    println(result)
//    println(searchArray)
//    binarySearch(searchArray, 9, 0, searchArray.lastIndex)
}

fun binarySearch(searchArray: List<Int>, searchData: Int, low: Int, high: Int): Int {
    if (low > high) return 0

    val mid = (high-low)/2

    return if (searchArray[mid] == searchData) {
        1
    } else if (searchArray[mid] > searchData) {
        binarySearch(searchArray, searchData, low, mid-1)
    } else {
        binarySearch(searchArray, searchData, mid+1, high)
    }
}