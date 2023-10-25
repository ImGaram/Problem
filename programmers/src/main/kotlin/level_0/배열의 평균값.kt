package level_0

class `배열의 평균값` {
    fun solution(numbers: IntArray): Double {
        var total = 0
        for (num in numbers) {
            total += num
        }

        return total / numbers.size.toDouble()
    }
}