package chapter2

import java.util.*

fun main(args:Array<String>) {
    val sc:Scanner = Scanner(System.`in`)
    var score = sc.nextInt()

    if (score<=100 && score>=90){
        print("A")
    }
    else if (score < 90 && score >=80) {
        print("B")
    }
    else if (score < 80 && score >=70) {
        print("C")
    }
    else if (score < 70 && score >=60) {
        print("D")
    }
    else
        print("F")
}