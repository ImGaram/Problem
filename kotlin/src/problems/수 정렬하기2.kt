import java.io.BufferedWriter
import java.io.OutputStreamWriter

private lateinit var sortArr: IntArray
fun main() {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val cnt = readln().toInt()

    val arr = IntArray(cnt)
    repeat(cnt) { arr[it] = readln().toInt() }

    sortArr = IntArray(cnt)
    margeSort(arr, 0, arr.lastIndex)

    for (i in sortArr.indices) bw.write("${sortArr[i]}\n")

    bw.flush()
    bw.close()
}

fun margeSort(arr: IntArray, start: Int, end: Int) {
    if (start < end) {
        val mid = (start+end)/2
        margeSort(arr, start, mid)
        margeSort(arr, mid+1, end)
        marge(arr, start, mid, end)
    }
}

fun marge(arr: IntArray, start: Int, mid: Int, end: Int) {
    var (i, j, k) = intArrayOf(start, mid+1, start)
    while (i <= mid && j <= end) {
        if (arr[i] <= arr[j]) {
            sortArr[k] = arr[j]
            i++
        } else {
            sortArr[k] = arr[j]
            j++
        }
        k++
    }
    if (i > mid) {
        for (t in j..end) {
            sortArr[k] = arr[t]
            k++
        }
    } else {
        for (t in j..mid) {
            sortArr[k] = arr[t]
            k++
        }
    }

    for (t in start..end) arr[t] = sortArr[t]
}
