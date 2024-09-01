package level_2

fun main() {
    println(solution(intArrayOf(18, 30, 102), intArrayOf(14, 35, 119)))
}

fun solution(arrayA: IntArray, arrayB: IntArray): Int {
    val gcdArrayA = getGcd(arrayA)
    val gcdArrayB = getGcd(arrayB)

    val arrayListA = arrayListOf<Int>()
    val arrayListB = arrayListOf<Int>()

    for (i in arrayA) {
        if (i % gcdArrayB == 0) {
            arrayListB.clear()
            break
        }
        else arrayListB.add(i % gcdArrayB)
    }

    for (i in arrayB) {
        if (i % gcdArrayA == 0) {
            arrayListA.clear()
            break
        }
        else arrayListA.add(i % gcdArrayA)
    }

    return if (arrayListA.size == arrayA.size && gcdArrayB < gcdArrayA) gcdArrayA
    else if (arrayListB.size == arrayB.size && gcdArrayB > gcdArrayA) gcdArrayB
    else 0
}

// 최대공약수를 구한다.
fun getGcd(arrayA: IntArray): Int {
    var gcd = arrayA[0]
    for (i in arrayA) {
        gcd = gcd(gcd, i)
    }
    return gcd
}

fun gcd(a: Int, b: Int): Int =
    if (b != 0) gcd(b, a%b)
    else a
