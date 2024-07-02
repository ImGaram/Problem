package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader

private var needTree = 0L
private var treeList = listOf<Long>()

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val treeInfo = readLine().split(" ").map { it.toLong() }
    needTree = treeInfo[1]
    treeList = readLine().split(" ").map { it.toLong() }

    binarySearch(1L, treeList.max())
}

private fun binarySearch(start: Long, end: Long) {
    if (start > end) {
        var resultCnt = 0L
        for (i in treeList.indices) {
            if (treeList[i] >= start)
                resultCnt += treeList[i] - start
        }

        if (resultCnt < needTree) println(end)
        else println(start)

        return
    }

    val mid: Long = (start + end) / 2
    var remain = 0L
    for (i in treeList.indices) {
        if (treeList[i] >= mid)
            remain += treeList[i] - mid
    }

    if (remain >= needTree) {
        binarySearch(mid + 1, end)
    } else {
        binarySearch(start, mid - 1)
    }
}