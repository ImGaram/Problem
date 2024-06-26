package problems.bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (mapX, mapY) = readLine().split(" ").map { it.toInt() }
    val (startX, startY) = readLine().split(" ").map { it.toInt() }
    val (endX, endY) = readLine().split(" ").map { it.toInt() }

    // 1, 1을 흰색으로 가정함. 2, 1은 검은색임.
    // 맵의 크기(x, y)가 1인 경우에는 이동이 불가함.
    if (mapX == 1 || mapY == 1) {
        if (startX == endX && startY == endY) println("YES")
        else println("NO")
    } else if (startX % 2 != 0 && startY % 2 != 0 || startX % 2 == 0 && startY % 2 == 0) {
        // 시작점이 흰색 블록임
        if (endX % 2 != 0 && endY % 2 != 0 || endX % 2 == 0 && endY % 2 == 0) println("YES")
        else println("NO")
    } else {
        // 시작점이 검은색 블록임
        // 검은색 칸은 endX가 홀수면 endY가 짝수여야 함. endX가 짝수면 endY가 홀수여야 함.
        if (endX % 2 != 0 && endY % 2 == 0 || endX % 2 == 0 && endY % 2 != 0) println("YES")
        else println("NO")
    }
}