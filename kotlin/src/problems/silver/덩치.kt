package problems.silver

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val case = readLine().toInt()
    val people = mutableListOf<List<Int>>()

    for (i in 0 until case) {
        people.add(readLine().split(" ").map { it.toInt() })
    }

    for (i in people.indices) {
        var rank = 1

        for (j in people.indices) {
            if (people[i][0] < people[j][0] && people[i][1] < people[j][1]) rank++
        }

        print("$rank ")
    }
}