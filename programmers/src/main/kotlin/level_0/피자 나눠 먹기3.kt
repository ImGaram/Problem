package level_0

class `피자 나눠 먹기3` {
    fun solution(slice: Int, n: Int): Int {
        var N: Int = n
        var answer = 1
        while (N > slice) {
            N-=slice
            answer++
        }

        return answer
    }
}