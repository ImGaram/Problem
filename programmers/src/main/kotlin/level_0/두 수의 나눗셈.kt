package level_0

class Main {
    fun solution(num1: Int, num2: Int): Int {
        val div = num1 / num2.toDouble()
        return (div * 1000).toInt()
    }
}
