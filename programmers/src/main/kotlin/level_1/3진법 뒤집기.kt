package main.kotlin.level_1

class `3진법 뒤집기` {
    fun solution(n: Int): Int {
        var answer: Int = 0

        // n을 3진법으로 변환 후, 좌우반전을 시키고 10진법으로 재변환.
        val n3String = n.toString(3)   // n을 3진법을 적용한 String으로 변환.
//        val reversedInt = n3String.reversed().toInt(3)  // n3String을 reversed(좌우반전) 후(10진법 으로 변경됨.) int 3진법으로 변경
//        answer = reversedInt.toString(10).toInt()   // 3진법 int를 10진법 String으로 변경 후, 다시 int로 변경.

        // 좌우반전하고 3진법으로 변환해서 출력
        // 이유: 10진법으로 바꿔도 똑같은 값이 나올 것이기 때문에 불필요한 코드를 줄임.
        answer = n3String.reversed().toInt(3)
        return answer
    }
}

fun main() {
    println(`3진법 뒤집기`().solution(45))
}