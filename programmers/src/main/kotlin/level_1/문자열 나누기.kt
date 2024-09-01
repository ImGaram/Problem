package main.kotlin.level_1

class `문자열 나누기` {
    // 첫 글자를 x라고 할 때, x와 x가 아닌 다른 글자의 수가 같아지면 그때까지 읽었던 문자를 분리하고 answer+=1 이 과정 반복
    fun solution(s: String): Int {
        var answer: Int = 0
        val string = StringBuilder(s)

        var xCnt = 0
        var otherCnt = 0
        while (string.isNotEmpty()) {
            val x: Char = string.first()

            // replace한 string이 1글자 이상일 수도 있나?
            if (xCnt == otherCnt) {
                xCnt = 0
                otherCnt = 0
            } else {
                answer++
                break
            }

            for (i in string.indices) {
                if (string[i] == x) xCnt++
                else otherCnt++

                if (xCnt == otherCnt) {
                    string.replace(0, xCnt+otherCnt, "")
                    answer++
                    break
                }
            }
        }

        return answer
    }
}

fun main() {
    println(`문자열 나누기`().solution("abracadabra"))
}