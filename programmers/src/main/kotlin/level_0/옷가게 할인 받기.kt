package level_0

class `옷가게 할인 받기` {
    fun solution(price: Int): Int {
        val discountPercent = if (price >= 500000) {
            0.2
        } else if (price in 300000..499999) {
            0.1
        } else if (price in 100000..299999) 0.05
        else 0.0

        return (price - price * discountPercent).toInt()
    }
}