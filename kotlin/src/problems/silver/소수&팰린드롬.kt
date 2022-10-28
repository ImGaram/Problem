import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val bf = BufferedReader(InputStreamReader(System.`in`))
    val number = bf.readLine().toInt()

    for (i in number..Int.MAX_VALUE) {
        // 1. 팰린드롬 구하기
        if (isPalindrome(i)) {
            // 2. 소수 구하기
            if (isPrime(i)) {
                println(i)
                break
            }
        }
    }
}

fun isPrime(number: Int): Boolean { // 소수 알고리즘
    if (number <= 1) return false

    if (number%2==0)
        return number==2
    
    for (i in 2 until number) {
        if (number % i == 0) return false
    }
    return true
}

fun isPalindrome(number: Int): Boolean {    // 팰린드롬 알고리즘
    val num = number.toString()
    return num == num.reversed()
}