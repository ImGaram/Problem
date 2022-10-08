package before.basicmath1

import java.util.*

fun main(args:Array<String>) {
    val sc:Scanner = Scanner(System.`in`);
    val a = sc.nextInt()
    val b = sc.nextInt()
    var c = sc.nextInt()
    var cnt=0

    if (c -b <0)
        cnt = -1;
    else {
        cnt = a/(c-b)
        cnt++
    }
    print(cnt)
    // 런타임 에러 /by zero
}