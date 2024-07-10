package problems.bronze

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val kind = readLine().toInt()
    val eggPlantKinds = readLine().split(" ")
    val (assistant, assistantKind) = readLine().split(" ").map { it.toInt() }
    val resultEggPlant = mutableListOf<String>()

    for (i in 0 until assistant) {
        val eggPlants = readLine().split(" ").map { eggPlantKinds[it.toInt() - 1] }
        if (eggPlants.contains("P")) resultEggPlant.add("P")
        else resultEggPlant.add("W")
    }

    if (resultEggPlant.contains("W")) println("W")
    else println("P")
}