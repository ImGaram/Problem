package level_1

class `숫자 문자열과 영단어` {
    fun solution(s: String): Int {
        var answer = ""
        var str = ""

        s.forEach { char ->
            try {
                val num =  char.toString().toInt()
                answer += num
            } catch (e: Exception) {
                str += char.toString()

                when (str) {
                    "zero" -> {
                        answer += "0"
                        str = ""
                    }
                    "one" -> {
                        answer += "1"
                        str = ""
                    }
                    "two" -> {
                        answer += "2"
                        str = ""
                    }
                    "three" -> {
                        answer += "3"
                        str = ""
                    }
                    "four" -> {
                        answer += "4"
                        str = ""
                    }
                    "five" -> {
                        answer += "5"
                        str = ""
                    }
                    "six" -> {
                        answer += "6"
                        str = ""
                    }
                    "seven" -> {
                        answer += "7"
                        str = ""
                    }
                    "eight" -> {
                        answer += "8"
                        str = ""
                    }
                    "nine" -> {
                        answer += "9"
                        str = ""
                    }
                }
            }
        }

        return answer.toInt()
    }
}

fun main() {
    `숫자 문자열과 영단어`().solution("one4seveneight")
}