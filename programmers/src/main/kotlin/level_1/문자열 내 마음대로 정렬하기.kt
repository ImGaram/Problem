package main.kotlin.level_1

class `문자열 내 마음대로 정렬하기` {
    // strings의 n번째 index를 기준으로 오름차순으로 정렬하기.
    fun solution(strings: Array<String>, n: Int): Array<String> {
        // 우선 전체 문자열을 기준으로 정렬하기(n번째 index가 같은 경우를 해결하기 위함).
        val stringsSort = strings.sorted()
        // 정렬된 list를 n번째 index를 기준으로 정렬하기.
        val answer = stringsSort.sortedBy { it[n] }
        println(answer)

        return answer.toTypedArray()
    }
}

fun main(args: Array<String>) {
    println(`문자열 내 마음대로 정렬하기`().solution(arrayOf("abce", "abcd", "cdx"), 1))
}