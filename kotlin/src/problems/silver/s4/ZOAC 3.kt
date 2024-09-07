package problems.silver.s4

import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.abs

private val consonants = listOf(
    listOf("q", "w", "e", "r", "t"),
    listOf("a", "s", "d", "f", "g"),
    listOf("z", "x", "c", "v", " "),
)
private val vowels = listOf(
    listOf(" ", "y", "u", "i", "o", "p"),
    listOf(" ", "h", "j", "k", "l", " "),
    listOf("b", "n", "m", " ", " ", " "),
)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (left, right) = readLine().split(" ")
    val inputValue = readLine().map { it.toString() }
    var currentConsonants = getKeyboardCoordinate(left).second
    var currentVowels = getKeyboardCoordinate(right).second
    var time = 0

    for (value in inputValue) {
        val valueCoordinatePair = getKeyboardCoordinate(value)
        when (valueCoordinatePair.first) {
            "consonants" -> {
                val distance = getDistance(currentConsonants, valueCoordinatePair.second)
                time += distance + 1
                currentConsonants = valueCoordinatePair.second
            }
            "vowels" -> {
                val distance = getDistance(currentVowels, valueCoordinatePair.second)
                time += distance + 1
                currentVowels = valueCoordinatePair.second
            }
        }
    }

    println(time)
}

private fun getKeyboardCoordinate(value: String): Pair<String, List<Int>> {
    var containsKeyboardType = ""
    var coordinate = listOf<Int>()

    for (i in consonants.indices) {
        for (j in 0 until consonants[i].size) {
            if (consonants[i][j] == value) {
                containsKeyboardType = "consonants"
                coordinate = listOf(i, j)
            }
        }
    }

    for (i in vowels.indices) {
        for (j in 0 until vowels[i].size) {
            if (vowels[i][j] == value) {
                containsKeyboardType = "vowels"
                coordinate = listOf(i, j)
            }
        }
    }


    return Pair(containsKeyboardType, coordinate)
}

private fun getDistance(value1: List<Int>, value2: List<Int>): Int {
    return abs(value1[0] - value2[0]) + abs(value1[1] - value2[1])
}