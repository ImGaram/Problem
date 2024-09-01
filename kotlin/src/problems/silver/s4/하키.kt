package problems.silver.s4

import java.util.Scanner
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

fun main() = with(Scanner(System.`in`)) {
    val w = nextInt()
    val h = nextInt()
    val x = nextInt()
    val y = nextInt()
    val players = nextInt()

    // 하키장에 선수가 있는 조건.
    // 직사각형과 반원 2개로 구성되어 있을 때,
    // 직사각형 안에 선수가 있거나,
    // 원의 중심과 선수 간의 거리가 h/2(반지름)보다 작아야 함.

    // 직사각형의 좌표
    val startCoordinate = listOf(x, y)
    val squareMaxCoordinate = listOf(x+w, y+h)

    // 원의 중심 좌표
    val circleCenterCoordinate1 = listOf(x, y+(h/2))        // 왼쪽 원의 중심
    val circleCenterCoordinate2 = listOf(x+w, y+(h/2))      // 오른쪽 원의 중심

    var inHockeyStadium = 0     // 경기장 안에 있는 선수의 수.
    for (i in 0 until players) {
        val playerX = nextInt()
        val playerY = nextInt()

        // 선수가 직사각형의 좌표 안에 있음.
        if (playerX in startCoordinate[0] .. squareMaxCoordinate[0] && playerY in startCoordinate[1] .. squareMaxCoordinate[1]) {
            inHockeyStadium++
            continue
        }
        // 선수가 직사각형의 x좌표픞 왼쪽으로 벗어남(y는 사이에 있음).
        else if (playerX < x && playerY in startCoordinate[1] .. squareMaxCoordinate[1]) {
            val distance = getDistanceBetweenPoints(playerX, playerY, circleCenterCoordinate1[0], circleCenterCoordinate1[1])
            if (distance <= h/2) {
                inHockeyStadium++
            }
            continue
        }
        // 선수가 직사각형의 x좌표를 오른쪽으로 벗어남(y는 사이에 있음).
        else if (playerX > x && playerY in startCoordinate[1] .. squareMaxCoordinate[1]) {
            val distance = getDistanceBetweenPoints(playerX, playerY, circleCenterCoordinate2[0], circleCenterCoordinate2[1])
            if (distance <= h/2) {
                inHockeyStadium++
            }
            continue
        }
    }

    println(inHockeyStadium)
}

// 두 점 사이의 거리를 구한다.
private fun getDistanceBetweenPoints(x1: Int, y1: Int, x2: Int, y2: Int): Double {
    val distanceX = abs(x1 - x2).toDouble()
    val distanceY = abs(y1 - y2).toDouble()

    return sqrt(distanceX.pow(2) + distanceY.pow(2))
}