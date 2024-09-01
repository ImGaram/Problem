package level_0

class `피자 나눠 먹기2` {
    fun solution(n: Int): Int {
        val lcm = n*6/gcd(n,6)

        return lcm/6
    }

    private fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a
        else gcd(b, a%b)
    }
}