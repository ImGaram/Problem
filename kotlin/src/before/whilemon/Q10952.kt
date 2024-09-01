package before.whilemon

import java.util.*

fun main(){
    val sc: Scanner = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()

    // ! = not(false)
    while (a!=0 && b!=0){
        println(a+b)
        a=sc.nextInt()
        b=sc.nextInt()
    }
}