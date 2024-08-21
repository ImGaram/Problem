import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var a = sc.nextInt()
    val b = sc.nextInt()
    val number = sc.nextInt()

    var res = 0
    var nm: Int

    // 소수 구하기
    for (i in 0..number) {
        res = a/b
        nm = a%b
        a=nm*10
    }

    println(res)
}
