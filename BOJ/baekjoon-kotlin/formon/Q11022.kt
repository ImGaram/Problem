package formon

import java.util.*

fun main(args:Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    val num = sc.nextInt()

    for (i in 1..num){
        val a:Int = sc.nextInt()
        val b:Int = sc.nextInt()
        print("Case #$i: ")
        print("$a + $b = ")
        println(a+b)
    }
}