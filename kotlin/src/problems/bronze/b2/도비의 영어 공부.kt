import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var alphabet = sc.next()
    var sameCnt = 0
    while (alphabet != "#") {
        val sentence = sc.nextLine()

        for (i in 0..sentence.lastIndex) {
            if (sentence.substring(i, i+1).equals(alphabet, ignoreCase = true)) sameCnt+=1
            else continue
        }
        println("$alphabet $sameCnt")
        sameCnt=0

        alphabet = sc.next()
    }
}