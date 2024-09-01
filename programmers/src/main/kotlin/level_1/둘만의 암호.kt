package main.kotlin.level_1

class `둘만의 암호` {
    // s의 각 문자를 index만큼 뒤로 옮기기
    // 옮기는 문자가 skip에 포함되어 있는 경우, 제외하고 넘어가기
    // 문자가 z를 넘어가면 a로 돌아가서 다시 시작.
    fun solution(s: String, skip: String, index: Int): String {
        var answer: String = ""
        var move = 0
        val rollbackCode = 97

        s.forEach { char ->
            var charCode = char.code
            while (move < index) {
                charCode++
                if (charCode > 122) charCode = rollbackCode
                if (skip.contains(charCode.toChar())) continue
                move++
            }
            move = 0

            answer += charCode.toChar()
        }

        return answer
    }
}

fun main() {
    // aukks, wbqd, 5
    // ybcde, za, 1
    println(`둘만의 암호`().solution("aukks", "wbqd", 5))
}