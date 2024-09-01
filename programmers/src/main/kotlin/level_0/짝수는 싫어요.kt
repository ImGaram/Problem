package level_0

fun main() {
    println(solution(10).toList())
}

fun solution(n: Int): IntArray {
    val answer = mutableListOf<Int>()

    for (i in 1 .. n step 2)
        answer.add(i)

    return answer.toIntArray()
}