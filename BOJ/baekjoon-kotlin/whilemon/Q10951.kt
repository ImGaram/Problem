package whilemon

import java.util.*

fun main(){

    // hasNextInt 는 Scanner 에서 정수를 입력받은 경우 true 를 정수를 입력받지 않는 경우 false 의 값을 반환받는 메소드
    val sc : Scanner = Scanner(System.`in`)
    while (sc.hasNextInt()){
        println(sc.nextInt()+sc.nextInt())
    }
//    val bf = BufferedReader(InputStreamReader(System.`in`))
//    val strs: List<String> = bf.readLine().split(" ")
//    var a = Integer.parseInt(strs[0])
//    var b = Integer.parseInt(strs[1])
//
//    while (a!=null && b!= null){
//        println(a+b)
//        a = Integer.parseInt(strs[0])
//        b = Integer.parseInt(strs[1])
//    }
}