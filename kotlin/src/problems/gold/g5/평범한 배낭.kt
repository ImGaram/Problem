package problems.gold.g5

import java.util.Scanner
import kotlin.math.max

fun main() = with(Scanner(System.`in`)) {
    // 4(물건의 수) 7(최대 무게)
    // 6(각 물건의 무게) 13(물건의 가치)
    val case = nextInt()
    val k = nextInt()

    val weight = Array(case+1) { 0 }
    val value = Array(case+1) { 0 }
    for (i in 0 until case) {
        val w = nextInt()
        val v = nextInt()
        weight[i+1] = w
        value[i+1] = v
    }

    // 각 weight마다 넣을 수 있는 최대 가치를 담을 리스트 생성.
    val weightArr = Array(case+1) { Array(k+1) { 0 } }

    // i가 현재 넣어야 할 아이템이 될 거임.
    for (i in 1 .. case) {
        // j가 점점 늘어가는 weight가 될 거임.
        for (j in 1 .. k) {
            // 현재 아이템의 무게와 가치.
            val w = weight[i]
            val v = value[i]

            // 물건의 무게가 최대 용량보다 큰 경우
            if (w > j) {
                weightArr[i][j] = weightArr[i-1][j]
            } else {
                // 현재 위치에서 바로 위 데이터와 바로 위 데이터에서 무게만큼 뺀 값에서 무게를 더한 값 중 더 큰 것을 데이터에 넣는다.
                // max의 2번째 조건에서 j-w 를 하는 이유는 j에서 w를 빼 새로운 물건이 들어오기 시작한 타이밍을 알 수 있기 때문이다.
                //
                // [0, 0, 0, 0, 8, 8, 13, 13]
                // [0, 0, 0, 6, 8, 8, 13, ??] => ??가 구해야 하는 값임.
                // ?? 기준 바로 위의 13과 바로 윗줄에서 현재 위치 - w를 해서 아이템이 들어갈 수 있는 공간을 확인한다(그곳은 이미 최적의 값이 계산되어 있다).
                weightArr[i][j] = max(weightArr[i-1][j], weightArr[i-1][j-w] +v)
            }
        }
    }

    println(weightArr[case][k])
}