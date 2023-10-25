package level_0

class `피자 나눠 먹기1` {
    fun solution(n: Int): Int {
        var N = n
        var res = 1
        while (N > 7) {
            N-=7
            res++
        }

        return res
    }
}