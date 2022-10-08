package function

import java.util.*

fun main() {
    val sc: Scanner = Scanner(System.`in`)
    val str: String = sc.nextLine()
    word(str)
}

fun word(s1:String) {
    var temp = s1.split(' ')
    var cnt: Int = 0
    for (element in temp){
        cnt++
        if (element.isEmpty()){
            cnt--
        }
    }
    println(cnt)
}
