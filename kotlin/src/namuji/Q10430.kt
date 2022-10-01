package namuji

import java.util.*

fun main(args:Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    val a= sc.nextInt()
    val b= sc.nextInt()
    val c= sc.nextInt()

    println((a+b)%c)
    println(((a%c)+(b%c))%c)
    println((a*b)%c)
    println(((a%c)*(b%c))%c)
}