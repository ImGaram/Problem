package level_0

fun main() {
    println(solution(5, 5).toList())
}

fun solution(num: Int, total: Int): IntArray {
    var answer = IntArray(num)
    var standard = 1    // 첫번쨰 시작하는 수
    var plus = 1    // 더해지는 수
    var numTotal = 0       // 숫자의 합

    repeat(num) {
        answer[it] = plus
        println(plus)
        numTotal+=plus
        plus++
    }

    while (numTotal != total) {
        if (numTotal < total) { // 총합이 total 보다 낮음
            numTotal = 0
            answer.toMutableList().clear()
            standard++
            plus = standard
            repeat(num) {
                answer[it] = plus
                numTotal+=plus
                plus++
            }
        } else if (numTotal > total) {
            numTotal = 0
            answer.toMutableList().clear()
            standard--
            plus = standard
            repeat(num) {
                answer[it] = plus
                numTotal+=plus
                plus++
            }
        }
    }

    return answer
}

// 1. 합을 더함
// 2. total 을 비교해 더 크면 기준값 -1, 작으면 기준값 +1
// 3. 반복