package ifmon

import java.util.*

fun main(args: Array<String>){
    val sc:Scanner = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()
    b-=45
    if (b<0){
        b+=60
        a--
        if (a<0){
            a+=24
        }
    }
    print(a)
    print(" ")
    print(b)
}