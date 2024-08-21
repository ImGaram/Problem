import java.util.Scanner

fun main() {
    // 거듭제곱 계산방법
    // 2의 n제곱이 짝수일때: 2n/2 * 2n/2
    // 홀수일때: 2(n-1)/2 * 2(n-1)/2 * 2
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    val b = sc.nextLong()
    val c = sc.nextInt()

    println(gop(a, b, c))
}

fun gop(a: Long, b: Long, c: Int): Long {
    if (b==0L) return 1

    val n = gop(a, b/2, c)
    val temp = n*n%c

    return if (b % 2 == 0L) {
        temp
    } else {
        a*temp%c
    }
}