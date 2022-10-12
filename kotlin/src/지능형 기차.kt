import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var total = 0
    var maxPeople = 0
    repeat(4) {
        val out = sc.nextInt()
        val busIn = sc.nextInt()

        total-=out
        total+=busIn
        if (total > maxPeople) maxPeople = total
    }

    println(maxPeople)
}