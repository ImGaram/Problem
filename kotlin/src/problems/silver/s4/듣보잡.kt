package src.problems.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val people = readLine().split(" ").map { it.toInt() }

    val noListen = mutableSetOf<String>()
    for (i in 0 until people.first()) {
        noListen.add(readLine())
    }

    val noSeen = mutableSetOf<String>()
    for (i in 0 until people.last()) {
        noSeen.add(readLine())
    }

    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val noListenSeen = noListen.intersect(noSeen).toTypedArray()
    Arrays.sort(noListenSeen)
    bw.write("${noListenSeen.size}\n")
    for (i in noListenSeen.indices) {
        bw.write("${noListenSeen[i]}\n")
    }

    bw.flush()
    bw.close()
}