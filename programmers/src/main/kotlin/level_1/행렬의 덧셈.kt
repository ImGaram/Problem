package main.kotlin.level_1

class `행렬의 덧셈` {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val answer = mutableListOf<IntArray>()
        arr1.forEachIndexed { rowIndex, _ ->
            val addArr = mutableListOf<Int>()
            arr1[rowIndex].forEachIndexed { columnIndex, _ ->
                addArr.add(arr1[rowIndex][columnIndex] + arr2[rowIndex][columnIndex])
            }

            answer.add(addArr.toIntArray())
        }

        return answer.toTypedArray()
    }
}

fun main(args: Array<String>) {
    println(`행렬의 덧셈`().solution(arrayOf(intArrayOf(1, 2), intArrayOf(2, 3)), arrayOf(intArrayOf(3, 4), intArrayOf(5, 6))))
}