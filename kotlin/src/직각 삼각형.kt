import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    while (true) {
        val a = sc.nextInt()
        val b = sc.nextInt()
        val c = sc.nextInt()

        if (a==0 && b==0 && c==0) break

        if (a > b && a > c) {
            if (a*a == b*b+c*c) println("right")
            else println("wrong")
        } else if (b > a && b > c) {
            if (b*b == a*a+c*c) println("right")
            else println("wrong")
        } else {
            if (c*c == b*b+a*a) println("right")
            else println("wrong")
        }
    }
}