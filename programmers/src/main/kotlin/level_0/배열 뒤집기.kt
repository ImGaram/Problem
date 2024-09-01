package level_0

class `배열 뒤집기` {
    fun solution(num_list: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        for (index in num_list.size-1 downTo 0) {
            answer.add(num_list[index])
        }

        return answer.toIntArray()
    }
}