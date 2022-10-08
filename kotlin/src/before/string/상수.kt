package function

import java.util.*

fun main() {
    val sc: Scanner = Scanner(System.`in`)
    var num1 = sc.nextInt()
    var num2 = sc.nextInt()
    changeNum(num1,num2)
}

fun changeNum(n1:Int, n2:Int) { //734 ->
    var n11 = n1
    var arr = IntArray(3) { 0 }
    var temp: String = ""

    for (i in arr.indices){
        arr[i] = n11%10
        n11/=10
        temp += arr[i].toString()
    }

    var n22 = n2
    var arr2 = IntArray(3) { 0 }
    var temp2: String = ""

    for (i in arr2.indices){
        arr2[i] = n22%10
        n22/=10
        temp2 += arr2[i].toString()
    }

    if(temp.toInt()>temp2.toInt()){
        println(temp)
    }
    else {
        println(temp2)
    }
}
