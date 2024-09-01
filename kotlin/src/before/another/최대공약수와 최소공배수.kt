package before.another

import java.util.*

fun main() {
    val sc: Scanner = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()

    var a1 = a
    var b1 = b
    while (b1 > 0){
       val temp : Int = b1
        b1=a1%b1
        a1 = temp
    }
    val ch = a1
    println(ch)
    println(a*b/ch)
}