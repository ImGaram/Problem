import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    val e = sc.nextInt()
    val s = sc.nextInt()
    val m = sc.nextInt()

    var cntE = 0
    var cntS = 0
    var cntM = 0
    var year = 0

    while (cntE != e || cntS != s || cntM != m) {
        cntE+=1
        cntS+=1
        cntM+=1
        if (cntE > 15) cntE = 1
        if (cntS > 28) cntS = 1
        if (cntM > 19) cntM = 1
        year+=1
    }

    println(year)
}