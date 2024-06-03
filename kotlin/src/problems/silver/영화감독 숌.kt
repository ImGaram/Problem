package src.problems.silver

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val movieNum = nextInt()
    var movie = 666
    var cnt = 1

    while (cnt != movieNum) {
        // 영화 번호를 1씩 더함
        movie++
        // 영화 번호에 666이 포함되어 있으면 cnt를 1씩 더함.
        if (movie.toString().contains("666")) {
            cnt++
        }
    }

    println(movie)
}