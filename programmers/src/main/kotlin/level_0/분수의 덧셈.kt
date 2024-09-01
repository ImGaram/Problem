package level_0

fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
    val answer = mutableListOf<Int>()

    val molecule = denom1*numer2 + denom2*numer1
    val denominator = denom1*denom2
    val gcd = gcd(molecule, denominator)

    answer.add(molecule/gcd)
    answer.add(denominator/gcd)
    return answer.toIntArray()
}

fun gcd(a: Int, b: Int): Int =
    if (b != 0) gcd(b, a%b)
    else a