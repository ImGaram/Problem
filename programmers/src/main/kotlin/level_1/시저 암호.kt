package main.kotlin.level_1

class `시저 암호` {
    fun solution(s: String, n: Int): String {
        var answer = ""
        val aInt = 97
        val AInt = 65

        // A = 65, a = 97
        // Z = 90, z = 122
        // s를 char로 나눠서 n만큼 이동된 값을 구하기.
        // char + n이 z값(122, 90)을 넘어가면? 다시 A, a부터 시작.
        for (char in s) {
            val charToInt = char.toInt()

            // 공백의 경우(32) 공백만 따로 추가해주기.
            if (charToInt == 32) {
                answer += " "
                continue
            }

            // char가 대문자인 경우
            if (char.isUpperCase()) {
                // 대문자 char가 Z값을 넘어감.
                if (charToInt + n > 90) {
                    val plusValue = charToInt + n - 90
                    // Z -> A로 한 번 움직이면 1이 소모되야 하기에 -1을 추가해주기.
                    answer += (AInt + plusValue - 1).toChar()
                    continue
                } else {
                    answer += (charToInt + n).toChar()
                    continue
                }
            }

            // char가 소문자인 경우
            else {
                // 소문자 char가 z값을 넘어감.
                if (charToInt + n > 122) {
                    println(charToInt + n)
                    val plusValue = charToInt + n - 122
                    // z -> a로 한 번 움직이면 1이 소모되야 하기에 -1을 추가해주기.
                    answer += (aInt + plusValue - 1).toChar()
                    continue
                } else {
                    answer += (charToInt + n).toChar()
                    continue
                }
            }
        }

        return answer
    }
}

fun main() {
    println(`시저 암호`().solution("AB", 1))
}