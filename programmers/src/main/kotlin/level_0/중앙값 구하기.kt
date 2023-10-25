package level_0

class `중앙값 구하기` {
    fun solution(array: IntArray): Int {
        val mid = array.size/2
        return array.sorted()[mid]
    }
}
