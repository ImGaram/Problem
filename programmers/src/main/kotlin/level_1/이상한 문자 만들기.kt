package main.kotlin.level_1

class `이상한 문자 만들기` {
    fun solution(s: String): String {
        var answer = ""
        val splitList = s.split(" ")

        splitList.forEachIndexed { i, string ->
            string.forEachIndexed { index, char ->
                // 입력받을 때 소문자만 오는 게 아닌 대문자도 섞여서 올 수 있기 때문에 소문자 처리도 같이 해주어야함.
                answer += if (index % 2 == 0) char.uppercase()
                else char.lowercase()
            }

            if (i < splitList.size -1) answer += " "
        }

        return answer
    }
}

fun main(args: Array<String>) {
    println(`이상한 문자 만들기`().solution("try hello world"))
}