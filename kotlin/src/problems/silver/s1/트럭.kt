package src.problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bridge = readLine().split(" ")
    val bridgeWidth = bridge[1].toInt()     // 다리에 동시에 올라갈 수 있는 트럭의 대수.
    val maxWeight = bridge.last().toInt()

    val trucks = readLine().split(" ").map { it.toInt() }.toMutableList()
    var truckWeight = 0     // 다리에 올라간 트럭의 무게를 구하기 위함.
    var moves = 0       // 트럭을 움직인 횟수.
    val bridgeQueue: Queue<Int> = LinkedList()  // 현재 다리에 올라간 트럭(비어 있으면 0)

    while (trucks.isNotEmpty()) {
        // 트럭을 넣고 큐가 다리의 무게를 초과해 다음 트럭을 넣을 수 없으면
        // 큐에 0을 넣어서 다리에 있는 트럭을 다음 트럭에 옮길 수 있도록 한 칸씩 밀어낸다.

        // 처음에 bridgeWidth보다 큐의 길이가 더 작은 경우는 숫자를 넣어준다(maxWeight보다 작을 때까지, 그 외의 경우는 0으로 넣기).
        // 큐의 길이가 bridgeWidth에 도달한 경우는 첫 데이터를 빼고 0 또는 trucks의 0번째 데이터를 넣어준다.
        // 큐의 sum에 trucks의 0번째 데이터를 더한 값이(truckWeight) maxWeight보다 작으면 trucks의 0번째 index를 넣고 아니면 0을 넣기.
        val trucksFirst = trucks.first()
        if (bridgeQueue.size >= bridgeWidth) {
            val remove = bridgeQueue.remove()
            if (remove != 0) truckWeight -= remove

            val addValue = if (truckWeight + trucksFirst <= maxWeight) trucksFirst else 0
            bridgeQueue.add(addValue)

            if (addValue != 0) {
                truckWeight += trucksFirst
                trucks.removeFirst()
            }
        } else {
            val addValue = if (truckWeight + trucksFirst <= maxWeight) trucksFirst else 0
            bridgeQueue.add(addValue)

            if (addValue != 0) {
                truckWeight += trucksFirst
                trucks.removeFirst()
            }
        }

        moves++
    }

    if (bridgeQueue.isNotEmpty()) moves += bridgeWidth
    println(moves)
}