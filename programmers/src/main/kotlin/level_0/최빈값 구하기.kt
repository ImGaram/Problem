package level_0

fun main() {
    println(`최빈값 구하기`().solution(intArrayOf(0,9,9,0,0)))
}

// 체감 0.9999 lv
class `최빈값 구하기` {
    fun solution(array: IntArray): Int {
        val countArray = MutableList(1000) { 0 }

        // 1 2 2 3 3 3 4
        // 0 1 2 3 1 0 0 0...
        for (item in array) {
            countArray[item]++
        }

        var maxIndex = 0
        for (i in countArray.indices) {
            if (maxIndex < countArray[i])   // 0 < 2
                maxIndex = countArray[i]
        }

        var res = 0
        var distinctCnt = 0
        for (i in countArray.indices) {
            if (countArray[i] == maxIndex) {
                res = i
                distinctCnt++
            }
        }

        return if (distinctCnt >= 2) -1
        else res
    }
}