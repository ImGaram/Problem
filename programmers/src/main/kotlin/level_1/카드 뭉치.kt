package level_1

class `카드 뭉치` {
    // cards 가 1, 2 가 존재함
    // 위의 cards를 이용해 goal을 만들어야 함
    // cards에 나와 있는 순서대로 문장을 만들어야 함
    // cards를 이용해서 goal을 만들 수 있으면, yes 반환, 아니면 no 반환
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        val cards1Mutable = cards1.toMutableList()
        val cards2Mutable = cards2.toMutableList()
        var answer = "Yes"

        for (card in goal) {
            if (cards1Mutable.isNotEmpty() && card == cards1Mutable[0]) {
                cards1Mutable.removeAt(0)
            } else if (cards2Mutable.isNotEmpty() && card == cards2Mutable[0]) {
                cards2Mutable.removeAt(0)
            } else {
                answer = "No"
                break
            }
        }

        println(answer)
        return answer
    }
}

fun main() {
    `카드 뭉치`().solution(arrayOf("i", "drink", "water"), arrayOf("want", "to"), arrayOf("i", "want", "to", "drink", "water"))
}