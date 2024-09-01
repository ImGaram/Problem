package level_1

class `최소직사각형` {
    // 지갑의 크기를 구하는 방법
    // 가로와 세로의 크기가 주어지면, 가로의 가장 큰 값 * 세로의 가장 큰 값으로 지갑의 크기를 정해 명함을 모두 담을 수 있음
    // 여기서, 가로 또는 세로에서 가장 큰 값과 대응하는 세로 또는 가로 값이 기존의 가로 세로보다 작거나 같은지 확인하기

    // 가로: 60, 30, 60, 80
    // 세로: 50, 70, 30, 40
    // 가로의 최대, 최소값: 80, 30, 세로의 최대, 최소값: 70, 30
    // 지갑은 명함의 크기보다 크거나 같아야함
    // 참고: https://tang25.tistory.com/entry/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%B5%9C%EC%86%8C%EC%A7%81%EC%82%AC%EA%B0%81%ED%98%95-Lv1-JAVA-%EA%B7%B8%EB%A6%AC%EB%94%94%EC%97%84%ED%83%B1
    fun solution(sizes: Array<IntArray>): Int {
        var resultMax = 0
        var resultMin = 0

        for (card in sizes) {
            val currentMax = if (card[0] > card[1]) card[0]
            else card[1]
            val currentMin = if (card[0] > card[1]) card[1]
            else card[0]

            if (resultMax < currentMax) resultMax = currentMax
            if (resultMin < currentMin) resultMin = currentMin
        }

        return resultMax * resultMin
    }
}

fun main() {
    `최소직사각형`().solution(arrayOf(intArrayOf(60, 50), intArrayOf(30, 70), intArrayOf(60, 30), intArrayOf(80, 40)))
}