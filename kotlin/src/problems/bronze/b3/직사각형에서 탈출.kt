package problems.bronze.b3

//현재 위치 x, y에서 직사각형의 가장자리로 가는 가장 짧은 거리의 경우의 수는 다음 4가지임
//(0, y) 를 향해 x축에 평행하게 걸어가기 => y
//(w, y) 를 향해 x축에 평행하게 걸어가기 => w-x
//(x, 0) 를 향해 y축에 평행하게 걸어가기 => x
//(x, h) 를 향해 y축에 평행하게 걸어가기 => h-y

import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val token = StringTokenizer(br.readLine())

    val x = token.nextToken().toInt()    // 위치 x
    val y = token.nextToken().toInt()    // 위치 y
    val w = token.nextToken().toInt()    // 직사각형의 최대 너비
    val h = token.nextToken().toInt()   // 직사각형의 최대 높이

    br.close()

    val distanceXToW = w-x
    val distanceYToH = h-y

    val distanceList = arrayOf(x, y, distanceXToW, distanceYToH)
    var min = 1001
    distanceList.forEach {
        if (it < min) min = it
    }

    bw.write(min.toString())
    bw.flush()
    bw.close()
}