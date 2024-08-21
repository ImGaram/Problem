import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var hour = sc.nextInt()
    val min = sc.nextInt()

    val plusMin = sc.nextInt()

    var totalMin = min+plusMin
    while (totalMin >= 60) {
        totalMin-=60

        if (hour == 23) hour = 0
        else hour+=1
    }

    println("$hour $totalMin")
}