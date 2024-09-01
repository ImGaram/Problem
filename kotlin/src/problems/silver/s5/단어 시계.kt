package problems.silver.s5

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val hour = nextInt()
    val minutes = nextInt()
    var isOverHalf = ""     // 30분 이전과 이후를 체크한다(past, to), 0인 경우는 o' clock.
    var changeMinute = ""      // 분을 영어로 변환.

    when (minutes) {
        in 1..30 -> {
            val hourEng = changeEng(hour)
            val minEng = if (minutes == 1) "minute" else "minutes"
            isOverHalf = "$minEng past"
            changeMinute = changeEng(minutes)

            if (minutes == 15 || minutes == 30) println("$changeMinute past $hourEng")
            else println("$changeMinute $isOverHalf $hourEng")
        }
        in 31 .. 59 -> {
            val hourEng = if (hour == 12) "one" else changeEng(hour+1)
            val minEng = if (60 - minutes == 1) "minute" else "minutes"
            isOverHalf = "$minEng to"
            changeMinute = changeEng(60 - minutes)

            if (60 - minutes == 15) println("$changeMinute to $hourEng")
            else println("$changeMinute $isOverHalf $hourEng")
        }
        else -> { // 정각인 경우
            val hourEng = changeEng(hour)
            isOverHalf = "o' clock"

            println("$hourEng $isOverHalf")
        }
    }
}

private fun changeEng(num: Int): String {
    return when (num) {
        1 -> "one"
        2 -> "two"
        3 -> "three"
        4 -> "four"
        5 -> "five"
        6 -> "six"
        7 -> "seven"
        8 -> "eight"
        9 -> "nine"
        10 -> "ten"
        11 -> "eleven"
        12 -> "twelve"
        13 -> "thirteen"
        14 -> "fourteen"
        15 -> "quarter"
        16 -> "sixteen"
        17 -> "seventeen"
        18 -> "eighteen"
        19 -> "nineteen"
        20 -> "twenty"
        21 -> "twenty one"
        22 -> "twenty two"
        23 -> "twenty three"
        24 -> "twenty four"
        25 -> "twenty five"
        26 -> "twenty six"
        27 -> "twenty seven"
        28 -> "twenty eight"
        29 -> "twenty nine"
        30 -> "half"
        else -> "error"
    }
}