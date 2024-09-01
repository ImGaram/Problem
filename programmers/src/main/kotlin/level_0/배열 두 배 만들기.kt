package level_0

fun solution(numbers: IntArray): IntArray {
    var answer = mutableListOf<Int>()
    for (i in numbers) {
        answer.add(i*2)
    }

    return answer.toIntArray()
}