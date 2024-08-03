package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

fun main() = with (BufferedReader(InputStreamReader(System.`in`))) {
    val (n, m, inv) = readLine().split(" ").map { it.toInt() }
    val block = mutableMapOf<Int, Int>()

    for (i in 0 until n) {
        val blocks = readLine().split(" ").map { it.toInt() }

        for (j in blocks.indices) {
            if (!block.containsKey(blocks[j])) block[blocks[j]] = 1
            else block[blocks[j]] = block[blocks[j]]!! + 1
        }
    }

    var res = listOf(Int.MAX_VALUE, -1)
    for (g in 0 .. 256) {
        // g: 현재 땅의 높이
        var time = 0
        var inventory = inv

        for (b in block) {
            if (b.key < g) {
                // 현재 땅보다 block의 높이가 낮으면 인벤토리에서 블록을 꺼내서 채워주어야 함.
                val fillCnt = (g - b.key) * b.value
                inventory -= fillCnt
                time += fillCnt
            } else if (b.key > g) {
                // 현재 땅보다 block의 높이가 높으면 현재 땅 높이까지 블록을 제거해 인벤토리에 넣어주어야 함.
                val removeCnt = (b.key - g) * b.value
                inventory += removeCnt
                time += (removeCnt * 2)
            }
        }

        if (inventory < 0) continue
        else {
            // 현재 최솟값과 변경된 최솟값이 변경되었는지 확인해야함.
            val currentMin = res[0]
            val changeMin = min(res[0], time)

            // 값이 변경되었으면 더 적은 시간이 들었다는 뜻이므로 ground 도 변경.
            if (currentMin != changeMin) res = listOf(changeMin, g)
            // 걸린 시간이 같으면 가장 높은 값을 구해 주어야 함.
            else if (currentMin == time) res = listOf(currentMin, g)
        }
    }

    println(res.joinToString(" "))
}