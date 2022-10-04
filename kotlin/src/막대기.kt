import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val stickSize = sc.nextInt()

    var stick = 64
    var totalStick = 0
    var cutCount = 0
    var tempStick = stickSize

/*    while (totalStick < stick) {
        while (stick > stickSize) {
            stick/=2
        }
        println(stick)      // 16
        stickSize-=stick    // 7
        totalStick+=stick
        println(stickSize)
        cutCount+=1
    }

    println(cutCount)*/

    // 값 입력 -> 64에서 나누기 2로 -> 나눈 값 더하기 -> 반복 2~3 -> 같거나 커지면 종료 -> 출력
    while (totalStick <= tempStick) {   // 16 20 22 23
        while (stick >= tempStick) { // 64 32 16 8 4 2
            stick/=2
        }
        // 16 + 4 + 2 + 1
        totalStick+=stick
        cutCount+=1
        tempStick = stick

        println("temp stick: $tempStick")
        println("$stick $totalStick")
    }
    println(cutCount)
}