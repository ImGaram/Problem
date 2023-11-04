package level_1

class `K번째 수` {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        val answer = mutableListOf<Int>()
        val list = mutableListOf<Int>()

        commands.forEach {
            for (index in it[0]-1 until it[1]) {
                list.add(array[index])
            }

            val sortedList = list.sorted()
            answer.add(sortedList[it[2]-1])
            list.clear()
        }

        println(answer)
        return answer.toIntArray()
    }
}

fun main() {
    `K번째 수`().solution(intArrayOf(1, 5, 2, 6, 3, 7, 4), arrayOf(intArrayOf(2,5,3), intArrayOf(4, 4, 1), intArrayOf(1,7,3)))
}