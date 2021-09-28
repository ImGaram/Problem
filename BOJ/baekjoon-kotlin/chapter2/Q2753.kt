package chapter2

import java.util.*

fun main(args:Array<String>){
    val sc:Scanner = Scanner(System.`in`)
    var year = sc.nextInt()

    if (year%4==0 && year % 100!=0 || year % 400==0)
        print("1")
    else
        print("0")
}