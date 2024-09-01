fun main() {
    val totalNum = readln().toLong()
    var n = 1L

    // 정수의 합 공식
    // 최댓값: n
    // n(n+1)/2 = total
    // 10(10+1)/2 = 55

    // n을 구하는 방법
    // n =
    // n2+n/2 = total

    while (true) {  // 5
        if (totalNum==2L) {
            println(1)
            break
        }
        if (totalNum - n*(n+1)/2 < n) {
            if (totalNum - n*(n+1)/2 < 0) {
                println(n-1)
                break
            }
            println(n)
            break
        }
        n++
    }
}