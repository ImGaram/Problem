package level_0

class `아이스 아메리카노` {
    fun solution(money: Int): IntArray {
        var cash = money
        var count = 0
        val answer = mutableListOf<Int>()

        while (cash >= 5500) {
            cash -= 5500
            count++
        }

        answer.add(count)
        answer.add(cash)
        return answer.toIntArray()
    }
}