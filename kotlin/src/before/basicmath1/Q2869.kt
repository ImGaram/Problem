package before.basicmath1

import java.util.*

fun main(args: Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()
    var v = sc.nextInt()
    var day = 0

    day = (v-b-1)/(a-b)+1
    print(day)
}