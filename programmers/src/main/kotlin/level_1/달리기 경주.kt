package level_1

fun solution(players: Array<String>, callings: Array<String>): Array<String> {
    val answer: Array<String> = players
    // ["mumu", "soe", "poe", "kai", "mine"]
    // kai kai mine mine
    /*for(i in answer.indices) {
        repeat(callings.size) { j ->


                answer.swap(i-1, i)
            }
        }
    }*/

    for(j in callings.indices) {
        for (i in players.indices) {
            if (players[i] == callings[j]) {
//                println("swapped: ${players[i]}, ${callings[j]}")
                println("swapped: ${players[i-1]}, ${players[i]}")
                answer.swap(i-1, i)
//                println("swapped: ${answer.toMutableList()}")
            }
        }
    }

    return answer
}

fun <T> Array<T>.swap(index1: Int, index2: Int) {
    val temp = this[index1]
    if (index1 == 1) this
    else {
        this[index1] = this[index2]
        this[index2] = temp
    }
}

fun main() {
    val request = arrayOf("mumu", "soe", "poe", "kai", "mine")
    val swapRequest = arrayOf("kai", "kai", "mine", "mine")

    println(solution(request, swapRequest).toMutableList())
}

