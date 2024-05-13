package main.kotlin.level_1

class `가장 가까운 같은 글자` {
    // for문으로 돌면서 char와 가장 가까운 같은 글자와의 거리를 구해야 함.
    fun solution(s: String): IntArray {
        val answer = mutableListOf<Int>()

        s.forEachIndexed { index, char ->
            // char보다 앞쪽의 string들을 불러오기 위한 compare 생성
            val compare = s.substring(0, index)
            // compare에서 char와 데이터가 같은 마지막 index를 불러옴.
            val resultIndex = compare.indexOfLast { it == char }
            // resultIndex가 -1이 아닌 경우(char 데이터와 같은 데이터가 존재함) 현재 index에서 resultIndex를 빼줌(거리를 구하기 위함.)
            if (resultIndex != -1) {
                answer.add(index - resultIndex)
            } else answer.add(resultIndex)
        }

        return answer.toIntArray()
    }
}

fun main() {
    println(`가장 가까운 같은 글자`().solution("foobar"))
}