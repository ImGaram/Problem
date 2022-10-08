package before.formon

import java.util.*

fun main(args:Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    var a = sc.nextInt()
    var t =0

    for (i in 1..a){
        t+=i
    }
    print(t)
}