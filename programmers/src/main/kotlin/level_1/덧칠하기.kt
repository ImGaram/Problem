package level_1

class `덧칠하기` {
    // n 미터의 벽을 m 미터인 롤러로 칠할 때, section이 칠해야 하는 곳임
    // 최소한의 움직임으로 벽을 칠하고자 함
    // 색을 앞 뒤로 번갈아서 칠해야 롤러가 벽을 벗어나지 않음

    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0                     // 칠한 count
        val wallArray = Array(n) { "O" }        // 벽의 색칠 상태를 나타낼 array(칠해짐: O, 색칠이 필요함: X)

        // 벽 배열 초기화
        section.forEach { wall ->
            wallArray[wall - 1] = "X"
        }

        // 로직 구성
        // section을 array로 받아오기
        // section의 첫 번째 index 부터 시작해서 index의 +m 까지의 index를 이용한 for문
        // 거기서 X가 있으면 O로 바꾸고 answer를 += 1 하기
        // 완료한 section의 index를 삭제하기
        // 뒤로 갈 때에는? section의 lastIndex를 이용해 downTo lastIndex - m 까지 for문
        // 거기서 X가 있으면 O로 바꾸고 answer를 += 1 하기
        // 완료한 section의 index를 삭제하기
        var frontBackState = true
        val sectionArray = section.toMutableList()
        while (sectionArray.isNotEmpty()) {
            // front
            if (frontBackState) {
                val firstIndex = sectionArray.first() - 1
                if (m == n) {
                    for (it in 0 until m) {
                        if (wallArray[it] == "X") {
                            wallArray[it] = "O"
                            sectionArray.removeAt(0)
                        }
                    }
                } else {
                    for (it in firstIndex until firstIndex + m) {
                        if (wallArray[it] == "X") {
                            wallArray[it] = "O"
                            sectionArray.removeAt(0)
                        }
                    }
                }
                answer += 1
                frontBackState = false
            }
            // back
            else {
                val lastIndex = sectionArray.last() - 1
                for (it in lastIndex downTo  lastIndex-m+1) {
                    if (wallArray[it] == "X") {
                        wallArray[it] = "O"
                        sectionArray.removeAt(sectionArray.lastIndex)
                    }
                }
                answer += 1
                frontBackState = true
            }
        }

        println(answer)
        return answer
    }
}

fun main() {
    `덧칠하기`().solution(5, 5, intArrayOf(3))
}