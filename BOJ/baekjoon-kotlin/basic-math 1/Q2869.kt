package basicmath1

import java.util.*

fun main(args: Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()
    var v = sc.nextInt()
    var day = 0

    while (true){
        v-=a
        day++
        if (v<=0)
            break
        v+=b
    }
    print(day)
}