package before.namuji

import java.util.*

fun main() {
    val sc: Scanner = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()
    var c = sc.nextInt()
    var d = sc.nextInt()
    var e = sc.nextInt()

    val total = a*a + b*b + c*c + d*d + e*e
    print(total%10)
}