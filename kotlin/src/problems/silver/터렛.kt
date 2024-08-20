package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()

    for (i in 0 until case) {
        val turret = readLine().split(" ").map { it.toDouble() }
        val (turret1X, turret1Y, radius1) = turret.subList(0, 3)
        val (turret2X, turret2Y, radius2) = turret.subList(3, 6)

        // 터렛의 좌포가 같고 반지름의 길이도 같으면 마린이 있는 경우는 무한대가 됨.
        if (turret1X == turret2X && turret1Y == turret2Y && radius1 == radius2) println(-1)
        else {
            // 두 점 사이의 거리 구하기.
            val distanceX = turret1X - turret2X
            val distanceY = turret1Y - turret2Y
            val distanceTurret = sqrt(distanceX.pow(2) + distanceY.pow(2))

            val radiusPlus = radius1 + radius2
            val radiusMinus = abs(radius1 - radius2)
            // 접점이 0개인 경우: 두 점 사이의 거리가 두 원의 반지름의 길이의 합보다 클 때, 또는 두 반지름의 차가 두 점 사이의 거리보다 클 때
            if (distanceTurret > radiusPlus || radiusMinus > distanceTurret) println(0)
            // 접점이 1개인 경우: 두 점 사이의 거리가 두 원의 반지름의 합과 같을 떄, 또는 두 반지름의 차가 두 점 사이의 거리와 같을 때
            else if (distanceTurret == radiusPlus || radiusMinus == distanceTurret) println(1)
            // 접점이 2개인 경우: 두 점 사이의 거리가 두 원의 반지름의 합보다 작을 때
            else println(2)
        }
    }
}