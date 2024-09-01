package problems.bronze.b4

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    var max = 0
    val arr = IntArray(3)
    arr[0] = a
    arr[1] = b
    arr[2] = c

    if (a == b && b == c) println(10000+a*1000)
    else if (a==b) println(1000+a*100)
    else if (b==c) println(1000+b*100)
    else if (a==c) println(1000+c*100)
    else {
        repeat(3) {
            if (arr[it] > max) max = arr[it]
        }

        println(max*100)
    }
}