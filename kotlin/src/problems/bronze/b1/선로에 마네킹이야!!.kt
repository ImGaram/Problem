package problems.bronze.b1

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    // 1초 기다리기: a -> b, b -> c, c면 변하지 않음.
    // 레버 당기기: 당김 -> 당기지 않음, 당기지 않음 -> 당김.
    // 광차
    // 초기 선로는: 5개의 마네킹이 묶여 있는 선로
    // a -> b로 이동할 때, 레버가 당기지 않은 상태면 5개 마네킹 쪽으로 그대로 감. 레버를 당겼으면 1개 마네킹 쪽으로 감.
    // b구역에서 레버를 당기면 두 선로를 동시에 타게 되어 6개가 깔리게 됨.
    // c구역에 도착하면 선로의 모든 마네킹이 깔린다.
    // 입력
    // P: 레버를 당김
    // W: 1초 기다리기, 구역 이동.
    nextInt()
    val movement = next().map { it }
    var currentArea = "a"
    var lever = false       // false: 당기지 않음(5). true: 당김(1).
    var dieSoon = 5     // 곧 깔릴 마네킹의 개수
    var result = 0      // 최종적으로 깔린 마네킹.
    for (move in movement) {
        when (move) {
            'W' -> {
                when (currentArea) {
                    "a" -> currentArea = "b"
                    "b" -> currentArea = "c"
                    "c" -> currentArea = "c"
                }
            }
            'P' -> {
                if (currentArea == "b") {
                    // b구역에서 레버를 움직이면 멀티트랙 드리프팅이 발생해 2개의 선로를 동시에 타게 됨.
                    lever = !lever
                    dieSoon = 6
                } else {
                    lever = !lever
                    dieSoon = if (lever) 1 else 5
                }
            }
        }

        // c구역이면 마네킹을 죽이고 종료.
        if (currentArea == "c") {
            result += dieSoon
            break
        } else result = 0
    }

    println(result)
}