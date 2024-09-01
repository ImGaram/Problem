import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val number = sc.nextInt()
    var honeyComb = 1
    var beforeHoneyComb: Int
    var honeyCombCnt = 1

    while (true) {
        beforeHoneyComb = honeyComb
        honeyComb += honeyCombCnt * 6  // 1 = 1 * 6 + 1
        honeyCombCnt++  // 돈 횟수

        if (number == 1) {  // 1 예외처리
            println(1)
            break
        }

        if (beforeHoneyComb + 1 <= number && number <= honeyComb) {
            println(honeyCombCnt)
            break
        } else continue
    }
}