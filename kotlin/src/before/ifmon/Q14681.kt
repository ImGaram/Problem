package before.ifmon

import java.util.*

fun main(args:Array<String>) {
    val sc :Scanner = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()

    if (a>0 && b>0)
        print("1")
    else if (a<0 && b>0)
        print("2")
    else if (a<0 && b<0)
        print("3")
    else if (a>0 && b<0)
        print("4")
}
